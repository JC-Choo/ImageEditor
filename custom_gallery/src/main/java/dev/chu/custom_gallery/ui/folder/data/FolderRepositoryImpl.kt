package dev.chu.custom_gallery.ui.folder.data

import android.content.Context
import android.database.Cursor
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import androidx.core.database.getStringOrNull
import dev.chu.core.util.ext.TAG
import dev.chu.core.util.ext.isAndroid29
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.entity.Album
import dev.chu.custom_gallery.etc.Const
import javax.inject.Inject

class FolderRepositoryImpl @Inject constructor() : FolderRepository {

    private val contentUri = Const.contentUri

    private val folderMap = LinkedHashMap<Long?, Album>()

    private val projection = arrayListOf(
        MediaStore.Files.FileColumns._ID,
        MediaStore.Files.FileColumns.BUCKET_ID,
        MediaStore.Files.FileColumns.BUCKET_DISPLAY_NAME,
        MediaStore.Files.FileColumns.DATE_MODIFIED
    ).apply {
        if (isAndroid29()) {
            add(MediaStore.Files.FileColumns.RELATIVE_PATH)
        } else {
            add(MediaStore.Files.FileColumns.DATA)
        }
    }.toTypedArray()

    private val selection =
        "${MediaStore.Files.FileColumns.MEDIA_TYPE}=? OR ${MediaStore.Files.FileColumns.MEDIA_TYPE}=?"

    private val selectionArgs: Array<String> = arrayOf(
        MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE.toString()
//        , MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO.toString()
    )

    private val sortOrder = "${MediaStore.Files.FileColumns.DATE_MODIFIED} DESC"

    override fun fetchFolders(context: Context): HashMap<Long?, Album> {
        //Recent
        val recentMediaCursor: Cursor? = context.contentResolver.query(
            contentUri,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )

        if (recentMediaCursor?.moveToNext() == true) {
            folderMap[null] = Album(
                contentUri = contentUri,
                recentMediaId = recentMediaCursor.getLong(
                    recentMediaCursor.getColumnIndex(
                        MediaStore.Files.FileColumns._ID
                    )
                ),
                bucketId = null,
                name = context.getString(R.string.all_picture),
                count = recentMediaCursor.count,
                order = Const.FOLDER_ORDER_RECENT,
                relativePath = recentMediaCursor.getStringOrNull(
                    recentMediaCursor.getColumnIndex(
                        MediaStore.Files.FileColumns.RELATIVE_PATH
                    )
                ),
                data = recentMediaCursor.getStringOrNull(
                    recentMediaCursor.getColumnIndex(
                        MediaStore.Files.FileColumns.DATA
                    )
                )
            )
        }
        recentMediaCursor?.close()

        // retrieve folder list
        val cursor: Cursor? = context.contentResolver.query(
            contentUri,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )
        cursor?.let { c ->
            while (c.moveToNext()) {
                val bucketId =
                    c.getLong(c.getColumnIndex(MediaStore.Files.FileColumns.BUCKET_ID))
                if (folderMap.contains(bucketId)) {
                    //hit
                    Log.d(TAG, "Already hit::bucketId = $bucketId")
                    folderMap[bucketId]?.increaseCount()
                    continue
                } else {
                    //add
                    val id = c.getLong(c.getColumnIndex(MediaStore.Files.FileColumns._ID))
                    val name =
                        c.getString(c.getColumnIndex(MediaStore.Files.FileColumns.BUCKET_DISPLAY_NAME))
                    val relativePath =
                        c.getStringOrNull(c.getColumnIndex(MediaStore.Files.FileColumns.RELATIVE_PATH))
                    val data =
                        c.getStringOrNull(c.getColumnIndex(MediaStore.Files.FileColumns.DATA))

                    var order =
                        c.getLong(c.getColumnIndex(MediaStore.Files.FileColumns.DATE_MODIFIED))

                    if (isAndroid29()) {
                        if (relativePath == "DCIM/Camera/") {
                            order = Const.FOLDER_ORDER_CAMERA
                        } else if (relativePath == "Download/") {
                            order = Const.FOLDER_ORDER_DOWNLOAD
                        }
                    }

                    if (!isAndroid29()) {
                        if (data == Environment.getExternalStoragePublicDirectory(
                                Environment.DIRECTORY_DCIM
                            ).toString()
                        ) {
                            order = Const.FOLDER_ORDER_CAMERA
                        } else if (data == Environment.getExternalStoragePublicDirectory(
                                Environment.DIRECTORY_DOWNLOADS
                            ).toString()
                        ) {
                            order = Const.FOLDER_ORDER_DOWNLOAD
                        }

                    }

                    folderMap[bucketId] = Album(
                        contentUri = contentUri,
                        recentMediaId = id,
                        bucketId = bucketId,
                        name = name,
                        count = 1,
                        order = order,
                        relativePath = relativePath,
                        data = data,
                    )
                    Log.d(TAG, "added::bucketId = $bucketId, name = $name, relativePath = $relativePath, data = $data")
                }
            }
        }
        cursor?.close()

        return folderMap
    }
}
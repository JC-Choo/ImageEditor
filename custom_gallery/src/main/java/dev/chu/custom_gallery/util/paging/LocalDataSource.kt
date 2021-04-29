package dev.chu.custom_gallery.util.paging

import android.content.ContentResolver
import android.provider.MediaStore
import android.util.Log
import androidx.core.database.getIntOrNull
import androidx.core.database.getLongOrNull
import androidx.core.database.getStringOrNull
import androidx.lifecycle.MutableLiveData
import androidx.paging.PositionalDataSource
import dev.chu.core.util.ext.TAG
import dev.chu.core.util.ext.isAndroid29
import dev.chu.custom_gallery.entity.Media
import dev.chu.custom_gallery.etc.Const

/**
 * 참고 싸이트 : https://codechacha.com/ko/android-jetpack-paging/
 *
 * DataSource
 * "데이터를 로딩"하는 객체"로 로컬 또는 Backend의 데이터를 가져오는 역할입니다.
 *
 * DataSource의 파생클래스
 * PositionalDataSource: 위치기반의 데이터를 로딩하는 DataSource입니다.
 *      ** 셀 수 있는 데이터, 고정된 사이즈의 데이터를 로딩할 때 사용됩니다.
 *      만약 끝을 알 수 없는 무한대의 아이템이라면, ItemKeyedDataSource 또는 PageKeyedDataSource이 적합합니다.
 *      ** Room은 PositionalDataSource 타입의 소스를 제공합니다.
 * ItemKeyedDataSource: 키 기반의 아이템을 로딩하는 DataSource입니다.
 * PageKeyedDataSource: 페이지 기반의 아이템을 로딩하는 DataSource입니다.
 *
 * 공통점 : 데이터를 가져온다는 것
 * 차이점 : 데이터 덩어리를 가져오는 방식이 다르다는 것
 *
 * PositionalDataSource
 * 특정 위치(index)에서 원하는 개수만큼 데이터를 가져올 수 있다면 PositionalDataSource 를 적용
 * loadInitial : 처음 데이터를 가져올 때 호출되는 함수
 * loadRange : 다음 데이터를 가져올 때 호출
 */
class LocalDataSource(
    private val contentResolver: ContentResolver,
    private val count: MutableLiveData<Int>,
    private var buckedId: Long? = null
): PositionalDataSource<Media>() {

    private val contentUri = Const.contentUri

    private val projection = arrayListOf(
        MediaStore.Files.FileColumns._ID,
        MediaStore.Files.FileColumns.DISPLAY_NAME,
        MediaStore.Files.FileColumns.MEDIA_TYPE,
        MediaStore.Files.FileColumns.MIME_TYPE,
        MediaStore.Files.FileColumns.DATE_MODIFIED,
        MediaStore.Files.FileColumns.DATE_TAKEN,
        MediaStore.Files.FileColumns.DATE_ADDED,
        MediaStore.Files.FileColumns.WIDTH,
        MediaStore.Files.FileColumns.HEIGHT,
        MediaStore.Files.FileColumns.ORIENTATION,
        MediaStore.Files.FileColumns.SIZE,
        MediaStore.Files.FileColumns.DURATION
    ).apply {
        if (isAndroid29()) {
            this.add(MediaStore.Files.FileColumns.RELATIVE_PATH)
        }
    }.toTypedArray()

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Media>) {
        Log.i(TAG, "loadInitial start: ${params.requestedStartPosition}, size: ${params.requestedLoadSize}")
        val data: MutableList<Media> = getMedias(params.requestedStartPosition, params.requestedLoadSize)
        callback.onResult(data, 0)
    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Media>) {
        Log.i(TAG, "loadRange start: ${params.startPosition}, size: ${params.loadSize}")
        val data = getMedias(params.startPosition, params.loadSize, false)
        callback.onResult(data)
    }

    private fun getMedias(startPosition: Int, loadSize: Int, isInitial: Boolean = true): MutableList<Media> {
        var selection = "${MediaStore.Files.FileColumns.MEDIA_TYPE}=?"
        val selectionArgs = arrayListOf(
            MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE.toString()
        )

        if (buckedId != null) {
            selection = "($selection) AND ${MediaStore.Files.FileColumns.BUCKET_ID}=?"
            selectionArgs.add("$buckedId")
        }

        val items = mutableListOf<Media>()

        val orderBy = MediaStore.Files.FileColumns.DATE_MODIFIED
        val sortOrder = "$orderBy DESC LIMIT $loadSize OFFSET $startPosition"
        val imageCursor = contentResolver.query(
            contentUri,
            projection,
            selection,
            selectionArgs.toTypedArray(),
            sortOrder
        )

        imageCursor?.let { cursor ->
            if (cursor.moveToFirst()) {
                do {
                    val relativePath: String? = if (isAndroid29()) {
                        cursor.getStringOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.RELATIVE_PATH))
                    } else {
                        null
                    }
                    items.add(
                        Media(
                        contentUri,
                        cursor.getLong(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID)),
                        cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns.DISPLAY_NAME)),
                        relativePath,
                        cursor.getInt(cursor.getColumnIndex(MediaStore.Files.FileColumns.MEDIA_TYPE)),
                        cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns.MIME_TYPE)),
                        cursor.getLong(cursor.getColumnIndex(MediaStore.Files.FileColumns.DATE_MODIFIED)),
                        cursor.getLongOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.DATE_TAKEN)),
                        cursor.getLongOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.DATE_ADDED)),
                        cursor.getIntOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.WIDTH)),
                        cursor.getIntOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.HEIGHT)),
                        cursor.getInt(cursor.getColumnIndex(MediaStore.Files.FileColumns.ORIENTATION)),
                        cursor.getInt(cursor.getColumnIndex(MediaStore.Files.FileColumns.SIZE)),
                        cursor.getLongOrNull(cursor.getColumnIndex(MediaStore.Files.FileColumns.DURATION))
                    )
                    )
                    imageCursor.moveToNext()
                } while (imageCursor.moveToNext())
            }
        }

        if (isInitial)
            count.postValue(imageCursor?.count ?: 0)

        imageCursor?.close()

        return items
    }
}
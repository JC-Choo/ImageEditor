package dev.chu.custom_gallery.etc

import android.net.Uri
import android.provider.MediaStore
import dev.chu.core.util.ext.isAndroid29

object Const {
    val contentUri: Uri = MediaStore.Files.getContentUri(if (isAndroid29()) MediaStore.VOLUME_EXTERNAL else "external")

    const val MEDIA = "MEDIA"
    const val MEDIA_LIST = "MEDIA_LIST"

    const val IMAGE_BYTE_ARRAY = "IMAGE_BYTE_ARRAY"

    const val FOLDER_ORDER_RECENT = Long.MAX_VALUE
    const val FOLDER_ORDER_CAMERA = Long.MAX_VALUE-1
    const val FOLDER_ORDER_DOWNLOAD = Long.MAX_VALUE-2
}
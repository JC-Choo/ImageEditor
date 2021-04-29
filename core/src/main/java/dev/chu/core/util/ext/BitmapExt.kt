package dev.chu.core.util.ext

import android.graphics.Bitmap
import java.io.ByteArrayOutputStream

fun Bitmap.toByteArray(): ByteArray {
    val bitmap = this
    val stream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)

    var byteArr = stream.toByteArray()
    if (byteArr.size > 500_000) {
        val ratio = byteArr.size.toDouble() / 500_000 * 100
        val result = if (ratio > 100) (ratio - 100).toInt() else ratio.toInt()
        val quality = 100 - result

        stream.reset()
        bitmap.compress(Bitmap.CompressFormat.JPEG, quality, stream)
        byteArr = stream.toByteArray()
    }
    return byteArr
}

fun Bitmap?.showCroppedImageOnView(
    left: Int, top: Int, width: Int, height: Int
): Bitmap? {
    var bitmap = this ?: return null
    bitmap = Bitmap.createBitmap(bitmap, left, top, width, height)
    return bitmap
}
package dev.chu.core.util.ext

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import java.io.ByteArrayOutputStream

fun ImageView.toBitmap(degrees: Float = 0f): Bitmap {
    val bitmapDrawable = this.drawable as BitmapDrawable
    var bitmap = bitmapDrawable.bitmap

    val matrix = Matrix()
    matrix.postRotate(degrees)

    bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, false)
    return bitmap
}

fun View.getBitmapFromView(): Bitmap? {
    val activity = this.context.findActivity()
    if (activity != null) {
        val size = context.findActivity()?.windowManager?.currentWindowMetricsPointCompat() ?: return null

        val x = size.x
        val y = size.y

        val bitmap = Bitmap.createBitmap(x, y, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        this.layout(left, top, right, bottom)
        this.draw(canvas)

        return bitmap
    }

    return null
}

fun View.getCroppedBitmapFromView(width: Int, height: Int): Bitmap? {
    var bitmap = this.getBitmapFromView() ?: return null
    val startLeftPoint = if(this.width - width > 0) (this.width - width) / 2 else 0
//    val startTopPoint = (this.height - height) / 2
    bitmap = Bitmap.createBitmap(
        bitmap,
        startLeftPoint,
        0,
        width,
        height
    )

    return bitmap
}

fun ImageView.setImageLoad(
    url: String? = null,
    bitmap: Bitmap? = null,
    uri: Uri? = null,
    @DrawableRes res: Int? = null,
    byteArray: ByteArray? = null
) {
    Glide.with(this.context)
        .load(url ?: bitmap ?: uri ?: res ?: byteArray)
        .into(this)
}

fun View.click(callback: (View) -> Unit) {
    this.setOnClickListener(callback)
}

fun ImageView.toByteArray(fromDegrees: Float): ByteArray {
    val stream = ByteArrayOutputStream()
    val bitmap = this.toBitmap(fromDegrees)
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

inline fun <T : ViewDataBinding> T.executeAfter(block: T.() -> Unit) {
    block.invoke(this)
    executePendingBindings()
}
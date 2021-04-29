package dev.chu.core.util.ext

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.getScaleOfScreen(bitmap: Bitmap): Bitmap {
    // 화면 크기를 구한다.
    val screenWidth = this.windowManager.currentWindowMetricsPointCompat().x
//    val screenHeight = findScreenSize().second

    // 화면 크기와 이미지 크기와의 비율을 구한다.
    val scale = screenWidth / bitmap.width.toFloat()

    // 위에서 구한 비율을 토대로, 이미지 크기를 확장시킨다.
    val imageWidth = (bitmap.width * scale).toInt()
    val imageHeight = (bitmap.height * scale).toInt()

    return Bitmap.createScaledBitmap(bitmap, imageWidth, imageHeight, false)
}
package dev.chu.core.util.ext

import android.content.Context
import android.content.ContextWrapper
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

fun Context.toast(@StringRes resId: Int, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, resId, duration).show()
}

fun Context.toast(text: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text.orEmpty(), duration).show()
}

fun Context.hasPermissions(vararg permissions: String): Boolean {
    for (permission in permissions) {
        if (ActivityCompat.checkSelfPermission(
                this,
                permission
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return false
        }
    }
    return true
}

fun Context.getDrawableById(@DrawableRes res: Int): Drawable =
    ContextCompat.getDrawable(this, res)!!


fun Context.getColorById(@ColorRes res: Int): Int =
    ContextCompat.getColor(this, res)

fun Context.findActivity(): AppCompatActivity? {
    var tempContext = this
    while (tempContext is ContextWrapper) {
        if (tempContext is AppCompatActivity) {
            return tempContext
        }
        tempContext = tempContext.baseContext
    }
    return null
}

fun Context.setBlur(bitmap: Bitmap): Bitmap {
    // Glide 사용 : https://itpangpang.xyz/244
    // 아래 사용 방법 : http://susemi99.kr/4684/
    val rs = RenderScript.create(this)
    val input = Allocation.createFromBitmap(rs, bitmap)
    val output = Allocation.createTyped(rs, input.type)
    val script = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs))
    script.setRadius(25f)
    script.setInput(input)
    script.forEach(output)
    output.copyTo(bitmap)

    return bitmap
}
package dev.chu.core.util

import android.net.Uri
import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageDrawable")
fun setImageDrawable(view: ImageView, @DrawableRes resId: Int) {
    Glide.with(view.context)
        .load(resId)
        .into(view)
}

@BindingAdapter("imageUri")
fun setImageDrawable(view: ImageView, uri: Uri) {
    Glide.with(view.context)
        .load(uri)
        .into(view)
}

@BindingAdapter("visible")
fun setVisible(view: View, visible: Boolean?) {
    view.visibility = if (visible == true) View.VISIBLE else View.GONE
}

@BindingAdapter("onClickEvent")
fun onClickEvent(view: View, clickEvent: View.OnClickListener?) {
    if (clickEvent != null) {
        view.setOnClickListener(clickEvent)
    }
}
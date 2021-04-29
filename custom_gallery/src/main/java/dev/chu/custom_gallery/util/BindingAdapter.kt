package dev.chu.custom_gallery.util

import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import dev.chu.core.util.ext.DP

@BindingAdapter("titleDrawableRight")
fun setTitleDrawableRight(tv: TextView, @DrawableRes res: Int) {
    tv.compoundDrawablePadding = 8.DP
    tv.setCompoundDrawablesWithIntrinsicBounds(0, 0, res, 0)
}
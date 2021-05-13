package dev.chu.custom_gallery.ui

import android.content.Context
import android.view.View
import androidx.annotation.DrawableRes
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import dev.chu.core.util.ext.getColorById
import dev.chu.custom_gallery.BR
import dev.chu.custom_gallery.R
import javax.inject.Inject

class ToolbarViewModel @Inject constructor(
    context: Context
) : BaseObservable() {

    // left image
    @DrawableRes
    var leftImageDrawable: Int = 0
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.leftImageDrawable)
        }

    // title text
    @DrawableRes
    var titleDrawableRight: Int? = null
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.titleDrawableRight)
        }

    var title: String = context.getString(R.string.all_picture)
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.title)
        }

    // right image
    var rightImageDrawable: Int = 0
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.rightImageDrawable)
        }

    var isRightVisible: Boolean = false
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.rightVisible)
        }

    // screen color
    var backgroundColor: Int = context.getColorById(R.color.white)
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.backgroundColor)
        }

    var titleColor: Int = 0
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.titleColor)
        }

    // click event
    var onClickLeft: View.OnClickListener? = null
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.onClickLeft)
        }

    var onClickTitle: View.OnClickListener? = null
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.onClickTitle)
        }

    var onClickRight: View.OnClickListener? = null
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.onClickRight)
        }
}
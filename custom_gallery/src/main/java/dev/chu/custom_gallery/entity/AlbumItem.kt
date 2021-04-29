package dev.chu.custom_gallery.entity

import android.content.ContentUris
import android.net.Uri
import androidx.databinding.BaseObservable
import dev.chu.custom_gallery.BR
import dev.chu.custom_gallery.R

class AlbumItem constructor(
    val album: Album,
    val listener: OnItemClickListener
) : BaseObservable() {

    fun getRecentMediaUri(): Uri {
        return ContentUris.withAppendedId(album.contentUri, album.recentMediaId)
    }

    fun getLayoutResId(): Int = R.layout.item_folder

    fun getBindingResId(): Int = BR.item

    interface OnItemClickListener {
        fun onClickFolder(item: AlbumItem)
    }
}
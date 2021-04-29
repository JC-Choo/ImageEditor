package dev.chu.custom_gallery.entity

import android.net.Uri
import androidx.databinding.BaseObservable

class MediaItem(
    val media: Media,
    val listener: OnItemClickListener
) : BaseObservable() {

    fun getUri(): Uri = media.getUri()

    fun getId(): Long = media.id

    interface OnItemClickListener {
        fun onItemClick(item: MediaItem)
    }
}
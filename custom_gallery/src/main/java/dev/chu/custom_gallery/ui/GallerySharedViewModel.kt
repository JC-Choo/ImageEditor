package dev.chu.custom_gallery.ui

import androidx.lifecycle.ViewModel
import dev.chu.core.SingleLiveEvent
import dev.chu.custom_gallery.entity.Album
import javax.inject.Inject

class GallerySharedViewModel @Inject constructor(): ViewModel() {

    val album = SingleLiveEvent<Album?>()

    fun setBucketId(album: Album? = null) {
        this.album.postValue(album)
    }
}
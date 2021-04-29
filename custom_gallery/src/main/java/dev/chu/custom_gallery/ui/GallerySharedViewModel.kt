package dev.chu.custom_gallery.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.chu.custom_gallery.entity.Album
import javax.inject.Inject

class GallerySharedViewModel @Inject constructor(): ViewModel() {

    private var _album = MutableLiveData<Album?>()
    val album: LiveData<Album?> get() = _album

    fun setBucketId(album: Album? = null) {
        _album.value = album
    }
}
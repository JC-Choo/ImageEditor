package dev.chu.custom_gallery.ui.main

import android.app.Application
import android.net.Uri
import androidx.lifecycle.*
import androidx.paging.PagedList
import dev.chu.core.SingleLiveEvent
import dev.chu.custom_gallery.entity.Album
import dev.chu.custom_gallery.entity.Media
import dev.chu.custom_gallery.entity.MediaItem
import dev.chu.custom_gallery.entity.Selection
import dev.chu.custom_gallery.ui.main.data.MainRepository
import dev.chu.custom_gallery.ui.main.data.MainRepositoryImpl
import java.io.IOException
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val app: Application
): AndroidViewModel(app), MediaItem.OnItemClickListener {

    private val repository: MainRepository = MainRepositoryImpl { item ->
        onItemClick(item)
    }

    val selection: Selection = Selection()

    private val bucketId = MutableLiveData<Long?>()
    val itemsOfAlbum: LiveData<PagedList<MediaItem>> = Transformations.switchMap(bucketId) {
        selection.clear()
        repository.getItems(app, it)
    }

    val currentAlbum = SingleLiveEvent<Album>()

    init {
        setBucketId()
    }

    fun setBucketId(album: Album? = null) {
        bucketId.value = album?.bucketId
        album?.let {
            currentAlbum.value = it
        }
    }

    fun getSelectedMediaList(): List<Media> {
        return selection.toList()
            .filter { media -> validateIfExist(media.getUri()) }
    }

    private fun validateIfExist(uri: Uri): Boolean {
        return try {
            app.contentResolver.openInputStream(uri)?.use { it.close() }
            true
        } catch (e: IOException) {
            e.printStackTrace()
            false
        }
    }

    override fun onItemClick(item: MediaItem) {
        selection.toggle(item.getId(), item.media)
        item.notifyChange()
    }
}
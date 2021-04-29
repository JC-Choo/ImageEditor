package dev.chu.custom_gallery.ui.folder

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dev.chu.core.SingleLiveEvent
import dev.chu.custom_gallery.entity.AlbumItem
import dev.chu.custom_gallery.ui.folder.data.FolderRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class FolderViewModel @Inject constructor(
    app: Application,
    private val repository: FolderRepositoryImpl
) : AndroidViewModel(app), AlbumItem.OnItemClickListener {

    val items = MutableLiveData<List<AlbumItem>>()

    val itemClickEvent = SingleLiveEvent<AlbumItem>()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            items.postValue(repository.fetchFolders(app.applicationContext).values
                .toList()
                .sortedByDescending { album -> album.order }
                .map { album ->
                    AlbumItem(album, this@FolderViewModel)
                })
        }
    }

    override fun onClickFolder(item: AlbumItem) {
        itemClickEvent.value = item
    }
}
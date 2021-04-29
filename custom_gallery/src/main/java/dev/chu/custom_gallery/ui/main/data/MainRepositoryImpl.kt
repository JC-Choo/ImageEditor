package dev.chu.custom_gallery.ui.main.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import dev.chu.custom_gallery.entity.MediaItem
import dev.chu.custom_gallery.util.paging.LocalDataSourceFactory
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val callback: (MediaItem) -> Unit
) : MainRepository, MediaItem.OnItemClickListener {

    private val count = MutableLiveData<Int>()

    override fun getItems(app: Application, buckedId: Long?): LiveData<PagedList<MediaItem>> {
        val dataSourceFactory = LocalDataSourceFactory(app.contentResolver, count, buckedId).map {
            MediaItem(it, this)
        }
        val pagedListConfig = PagedList.Config.Builder()
            .setPageSize(20)
            .setInitialLoadSizeHint(60)
            .setEnablePlaceholders(false)
            .build()

        return LivePagedListBuilder(dataSourceFactory, pagedListConfig).build()
    }

    override fun getCount(): LiveData<Int> = count

    override fun onItemClick(item: MediaItem) {
        callback.invoke(item)
    }
}
package dev.chu.custom_gallery.ui.main.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import dev.chu.custom_gallery.entity.MediaItem

interface MainRepository {
    fun getItems(app: Application, buckedId: Long? = null): LiveData<PagedList<MediaItem>>
    fun getCount(): LiveData<Int>
}
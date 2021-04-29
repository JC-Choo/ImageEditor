package dev.chu.custom_gallery.util.paging

import android.content.ContentResolver
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import dev.chu.custom_gallery.entity.Media

/**
 * DataSource.Factory:
 * [DataSource] 를 생성하는 역할
 */
class LocalDataSourceFactory(
    private val contentResolver: ContentResolver,
    private val count: MutableLiveData<Int>,
    private var buckedId: Long? = null
) : DataSource.Factory<Int, Media>() {
    override fun create(): DataSource<Int, Media> {
        return LocalDataSource(contentResolver, count, buckedId)
    }
}
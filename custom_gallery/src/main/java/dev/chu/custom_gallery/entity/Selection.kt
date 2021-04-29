package dev.chu.custom_gallery.entity

import android.os.Parcelable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dev.chu.core.SingleLiveEvent
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
class Selection(
    private val items: LinkedHashMap<Long, Media> = LinkedHashMap()
): Parcelable {

    @IgnoredOnParcel
    private val count = MutableLiveData(items.size)

    @IgnoredOnParcel
    val isUpThreeSelectedItem = SingleLiveEvent<Boolean>()

    private fun select(id: Long, item: Media) {
        items[id] = item
        count.value = items.size
    }

    private fun deselect(id: Long) {
        items.remove(id)
        count.value = items.size
    }

    fun toggle(id: Long, item: Media) {
        if (isSelected(id)) {
            deselect(id)
        } else {
            isUpThreeSelectedItem.value = items.size >= 3
            if (items.size < 3) {
                select(id, item)
            }
        }
    }

    fun isSelected(id: Long): Boolean {
        return items.containsKey(id)
    }

    fun toList(): List<Media> {
        return items.values.toList()
    }

    fun clear() {
        count.value = 0
        items.clear()
    }

    fun getCount(): LiveData<Int> = count
}
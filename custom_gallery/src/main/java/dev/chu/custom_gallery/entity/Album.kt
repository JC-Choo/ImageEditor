package dev.chu.custom_gallery.entity

import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Album constructor(
    val contentUri: Uri,
    val recentMediaId: Long,
    val bucketId: Long?,
    val name: String,
    var count: Int,
    val order: Long,
    val relativePath: String?,
    val data: String?
) : Parcelable {

    fun increaseCount() {
        count += 1
    }
}
package dev.chu.custom_gallery.ui.folder.data

import android.content.Context
import dev.chu.custom_gallery.entity.Album

interface FolderRepository {
    fun fetchFolders(context: Context): HashMap<Long?, Album>
}
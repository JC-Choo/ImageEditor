package dev.chu.custom_gallery.ui.folder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.chu.custom_gallery.databinding.ItemFolderBinding
import dev.chu.custom_gallery.entity.AlbumItem

class FolderAdapter : RecyclerView.Adapter<FolderAdapter.FolderViewHolder>() {

    private val items = ArrayList<AlbumItem>()

    fun setNewItems(newItems: List<AlbumItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFolderBinding.inflate(inflater, parent, false)
        return FolderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FolderViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.count()

    class FolderViewHolder(
        private val binding: ItemFolderBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: AlbumItem) {
            binding.item = item
            binding.executePendingBindings()
        }
    }
}
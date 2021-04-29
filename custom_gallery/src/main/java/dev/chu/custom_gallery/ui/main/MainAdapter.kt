package dev.chu.custom_gallery.ui.main

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.signature.MediaStoreSignature
import dev.chu.core.base.BaseViewHolder
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.databinding.ItemGalleryBinding
import dev.chu.custom_gallery.entity.MediaItem

class MainAdapter(
    private val viewModel: MainViewModel
) : PagedListAdapter<MediaItem, BaseViewHolder<ItemGalleryBinding>>(diffCallback) {
    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<MediaItem>() {
            override fun areItemsTheSame(oldItem: MediaItem, newItem: MediaItem): Boolean {
                return oldItem.media.id == newItem.media.id
            }

            override fun areContentsTheSame(oldItem: MediaItem, newItem: MediaItem): Boolean {
                return oldItem.media == newItem.media
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ItemGalleryBinding> {
        return BaseViewHolder(parent, R.layout.item_gallery)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<ItemGalleryBinding>, position: Int) {
        getItem(position)?.let { item ->
            holder.binding.item = item
            holder.binding.position = position
            holder.binding.selection = viewModel.selection
            Glide.with(holder.binding.image)
                .load(item.getUri())
                .signature(MediaStoreSignature(item.media.mimeType, item.media.dateModified, item.media.orientation))
                .into(holder.binding.image)
            holder.binding.executePendingBindings()
        }
    }
}
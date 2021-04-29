package dev.chu.imageeditor

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.chu.core.util.ext.click
import dev.chu.imageeditor.databinding.ItemViewBinding

//class MainViewHolder(
//    private val binding: ItemViewBinding,
//    private val callback: (Media) -> Unit
//) : RecyclerView.ViewHolder(binding.root) {
//
//    fun bind(item: Media) {
//        with(binding.imageView) {
//            Glide.with(context).load(item.getUri()).into(this)
//            click { callback(item) }
//        }
//        binding.executePendingBindings()
//    }
//}
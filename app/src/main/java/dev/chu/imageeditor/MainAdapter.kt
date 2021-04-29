package dev.chu.imageeditor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.chu.custom_gallery.entity.Media
import dev.chu.imageeditor.databinding.ItemViewBinding

class MainAdapter(
    private val callback: (Media) -> Unit
): RecyclerView.Adapter<MainViewHolder>() {

    private val items = mutableListOf<Media>()

    fun setNewItems(newItems: List<Media>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(binding, callback)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.count()
}
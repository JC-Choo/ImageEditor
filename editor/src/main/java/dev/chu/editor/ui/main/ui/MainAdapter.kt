package dev.chu.editor.ui.main.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import dev.chu.core.util.ext.executeAfter
import dev.chu.editor.R
import dev.chu.editor.databinding.ItemMainBinding
import dev.chu.editor.ui.main.data.EditTypeItem

class MainAdapter: RecyclerView.Adapter<MainViewHolder>() {
    private var items = ArrayList<EditTypeItem>()

    fun setNewItems(newItems: List<EditTypeItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemMainBinding>(inflater, R.layout.item_main, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.count()
}

class MainViewHolder(
    private val binding: ItemMainBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: EditTypeItem) {
        binding.executeAfter {
            this.item = item
        }
    }
}
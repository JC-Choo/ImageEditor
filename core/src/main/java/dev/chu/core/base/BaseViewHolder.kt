package dev.chu.core.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<VDB : ViewDataBinding> : RecyclerView.ViewHolder {
    val binding: VDB

    constructor(binding: VDB) : super(binding.root) {
        this.binding = binding
    }

    constructor(parent: ViewGroup, layoutId: Int) : this(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), layoutId, parent, false)
    )
}
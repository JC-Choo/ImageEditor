package dev.chu.custom_gallery.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldev/chu/custom_gallery/ui/main/MainAdapter;", "Landroidx/paging/PagedListAdapter;", "Ldev/chu/custom_gallery/entity/MediaItem;", "Ldev/chu/core/base/BaseViewHolder;", "Ldev/chu/custom_gallery/databinding/ItemGalleryBinding;", "viewModel", "Ldev/chu/custom_gallery/ui/main/MainViewModel;", "(Ldev/chu/custom_gallery/ui/main/MainViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "custom_gallery_debug"})
public final class MainAdapter extends androidx.paging.PagedListAdapter<dev.chu.custom_gallery.entity.MediaItem, dev.chu.core.base.BaseViewHolder<dev.chu.custom_gallery.databinding.ItemGalleryBinding>> {
    private final dev.chu.custom_gallery.ui.main.MainViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<dev.chu.custom_gallery.entity.MediaItem> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.ui.main.MainAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.chu.core.base.BaseViewHolder<dev.chu.custom_gallery.databinding.ItemGalleryBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dev.chu.core.base.BaseViewHolder<dev.chu.custom_gallery.databinding.ItemGalleryBinding> holder, int position) {
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.main.MainViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldev/chu/custom_gallery/ui/main/MainAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ldev/chu/custom_gallery/entity/MediaItem;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "custom_gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<dev.chu.custom_gallery.entity.MediaItem> getDiffCallback() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
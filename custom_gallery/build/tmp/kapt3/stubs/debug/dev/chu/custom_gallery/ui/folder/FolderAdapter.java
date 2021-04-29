package dev.chu.custom_gallery.ui.folder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/FolderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/chu/custom_gallery/ui/folder/FolderAdapter$FolderViewHolder;", "()V", "items", "Ljava/util/ArrayList;", "Ldev/chu/custom_gallery/entity/AlbumItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNewItems", "newItems", "", "FolderViewHolder", "custom_gallery_debug"})
public final class FolderAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dev.chu.custom_gallery.ui.folder.FolderAdapter.FolderViewHolder> {
    private final java.util.ArrayList<dev.chu.custom_gallery.entity.AlbumItem> items = null;
    
    public final void setNewItems(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.chu.custom_gallery.entity.AlbumItem> newItems) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dev.chu.custom_gallery.ui.folder.FolderAdapter.FolderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.folder.FolderAdapter.FolderViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public FolderAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/FolderAdapter$FolderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Ldev/chu/custom_gallery/databinding/ItemFolderBinding;", "(Ldev/chu/custom_gallery/databinding/ItemFolderBinding;)V", "bind", "", "item", "Ldev/chu/custom_gallery/entity/AlbumItem;", "custom_gallery_debug"})
    public static final class FolderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final dev.chu.custom_gallery.databinding.ItemFolderBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.entity.AlbumItem item) {
        }
        
        public FolderViewHolder(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.databinding.ItemFolderBinding binding) {
            super(null);
        }
    }
}
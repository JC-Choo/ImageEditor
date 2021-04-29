package dev.chu.custom_gallery.ui.folder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/FolderViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Ldev/chu/custom_gallery/entity/AlbumItem$OnItemClickListener;", "app", "Landroid/app/Application;", "repository", "Ldev/chu/custom_gallery/ui/folder/data/FolderRepositoryImpl;", "(Landroid/app/Application;Ldev/chu/custom_gallery/ui/folder/data/FolderRepositoryImpl;)V", "itemClickEvent", "Ldev/chu/core/SingleLiveEvent;", "Ldev/chu/custom_gallery/entity/AlbumItem;", "getItemClickEvent", "()Ldev/chu/core/SingleLiveEvent;", "items", "Landroidx/lifecycle/MutableLiveData;", "", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "onClickFolder", "", "item", "custom_gallery_debug"})
public final class FolderViewModel extends androidx.lifecycle.AndroidViewModel implements dev.chu.custom_gallery.entity.AlbumItem.OnItemClickListener {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<dev.chu.custom_gallery.entity.AlbumItem>> items = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.AlbumItem> itemClickEvent = null;
    private final dev.chu.custom_gallery.ui.folder.data.FolderRepositoryImpl repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<dev.chu.custom_gallery.entity.AlbumItem>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.AlbumItem> getItemClickEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void onClickFolder(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.AlbumItem item) {
    }
    
    @javax.inject.Inject()
    public FolderViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.folder.data.FolderRepositoryImpl repository) {
        super(null);
    }
}
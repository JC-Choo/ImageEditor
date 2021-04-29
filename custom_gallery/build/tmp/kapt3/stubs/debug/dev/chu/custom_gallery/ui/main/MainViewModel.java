package dev.chu.custom_gallery.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0012\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Ldev/chu/custom_gallery/ui/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "bucketId", "Landroidx/lifecycle/MutableLiveData;", "", "currentAlbum", "Ldev/chu/core/SingleLiveEvent;", "Ldev/chu/custom_gallery/entity/Album;", "getCurrentAlbum", "()Ldev/chu/core/SingleLiveEvent;", "itemsOfAlbum", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Ldev/chu/custom_gallery/entity/MediaItem;", "getItemsOfAlbum", "()Landroidx/lifecycle/LiveData;", "repository", "Ldev/chu/custom_gallery/ui/main/data/MainRepository;", "selection", "Ldev/chu/custom_gallery/entity/Selection;", "getSelection", "()Ldev/chu/custom_gallery/entity/Selection;", "getSelectedMediaList", "", "Ldev/chu/custom_gallery/entity/Media;", "onItemClick", "", "item", "setBucketId", "album", "validateIfExist", "", "uri", "Landroid/net/Uri;", "custom_gallery_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel implements dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener {
    private final dev.chu.custom_gallery.ui.main.data.MainRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.custom_gallery.entity.Selection selection = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> bucketId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<dev.chu.custom_gallery.entity.MediaItem>> itemsOfAlbum = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.Album> currentAlbum = null;
    private final android.app.Application app = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.Selection getSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<dev.chu.custom_gallery.entity.MediaItem>> getItemsOfAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.Album> getCurrentAlbum() {
        return null;
    }
    
    public final void setBucketId(@org.jetbrains.annotations.Nullable()
    dev.chu.custom_gallery.entity.Album album) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.chu.custom_gallery.entity.Media> getSelectedMediaList() {
        return null;
    }
    
    private final boolean validateIfExist(android.net.Uri uri) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.MediaItem item) {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}
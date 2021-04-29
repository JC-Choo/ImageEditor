package dev.chu.custom_gallery.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Ldev/chu/custom_gallery/ui/GallerySharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_album", "Landroidx/lifecycle/MutableLiveData;", "Ldev/chu/custom_gallery/entity/Album;", "album", "Landroidx/lifecycle/LiveData;", "getAlbum", "()Landroidx/lifecycle/LiveData;", "setBucketId", "", "custom_gallery_debug"})
public final class GallerySharedViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<dev.chu.custom_gallery.entity.Album> _album;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<dev.chu.custom_gallery.entity.Album> getAlbum() {
        return null;
    }
    
    public final void setBucketId(@org.jetbrains.annotations.Nullable()
    dev.chu.custom_gallery.entity.Album album) {
    }
    
    @javax.inject.Inject()
    public GallerySharedViewModel() {
        super();
    }
}
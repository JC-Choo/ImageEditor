package dev.chu.custom_gallery.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0005R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Ldev/chu/custom_gallery/ui/GallerySharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "album", "Ldev/chu/core/SingleLiveEvent;", "Ldev/chu/custom_gallery/entity/Album;", "getAlbum", "()Ldev/chu/core/SingleLiveEvent;", "setBucketId", "", "custom_gallery_debug"})
public final class GallerySharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.Album> album = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.core.SingleLiveEvent<dev.chu.custom_gallery.entity.Album> getAlbum() {
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
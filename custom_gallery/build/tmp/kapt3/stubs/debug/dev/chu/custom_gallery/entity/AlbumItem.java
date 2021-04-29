package dev.chu.custom_gallery.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Ldev/chu/custom_gallery/entity/AlbumItem;", "Landroidx/databinding/BaseObservable;", "album", "Ldev/chu/custom_gallery/entity/Album;", "listener", "Ldev/chu/custom_gallery/entity/AlbumItem$OnItemClickListener;", "(Ldev/chu/custom_gallery/entity/Album;Ldev/chu/custom_gallery/entity/AlbumItem$OnItemClickListener;)V", "getAlbum", "()Ldev/chu/custom_gallery/entity/Album;", "getListener", "()Ldev/chu/custom_gallery/entity/AlbumItem$OnItemClickListener;", "getBindingResId", "", "getLayoutResId", "getRecentMediaUri", "Landroid/net/Uri;", "OnItemClickListener", "custom_gallery_debug"})
public final class AlbumItem extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.custom_gallery.entity.Album album = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.custom_gallery.entity.AlbumItem.OnItemClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getRecentMediaUri() {
        return null;
    }
    
    public final int getLayoutResId() {
        return 0;
    }
    
    public final int getBindingResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.Album getAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.AlbumItem.OnItemClickListener getListener() {
        return null;
    }
    
    public AlbumItem(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.Album album, @org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.AlbumItem.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldev/chu/custom_gallery/entity/AlbumItem$OnItemClickListener;", "", "onClickFolder", "", "item", "Ldev/chu/custom_gallery/entity/AlbumItem;", "custom_gallery_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClickFolder(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.entity.AlbumItem item);
    }
}
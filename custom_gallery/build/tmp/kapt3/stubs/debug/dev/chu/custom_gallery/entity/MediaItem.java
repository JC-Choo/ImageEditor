package dev.chu.custom_gallery.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Ldev/chu/custom_gallery/entity/MediaItem;", "Landroidx/databinding/BaseObservable;", "media", "Ldev/chu/custom_gallery/entity/Media;", "listener", "Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;", "(Ldev/chu/custom_gallery/entity/Media;Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;)V", "getListener", "()Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;", "getMedia", "()Ldev/chu/custom_gallery/entity/Media;", "getId", "", "getUri", "Landroid/net/Uri;", "OnItemClickListener", "custom_gallery_debug"})
public final class MediaItem extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.custom_gallery.entity.Media media = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.Media getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener getListener() {
        return null;
    }
    
    public MediaItem(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.Media media, @org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;", "", "onItemClick", "", "item", "Ldev/chu/custom_gallery/entity/MediaItem;", "custom_gallery_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.entity.MediaItem item);
    }
}
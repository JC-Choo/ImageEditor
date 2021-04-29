package dev.chu.custom_gallery.ui.folder.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0010\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0011j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b`\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/data/FolderRepositoryImpl;", "Ldev/chu/custom_gallery/ui/folder/data/FolderRepository;", "()V", "contentUri", "Landroid/net/Uri;", "folderMap", "Ljava/util/LinkedHashMap;", "", "Ldev/chu/custom_gallery/entity/Album;", "projection", "", "", "[Ljava/lang/String;", "selection", "selectionArgs", "sortOrder", "fetchFolders", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "context", "Landroid/content/Context;", "custom_gallery_debug"})
public final class FolderRepositoryImpl implements dev.chu.custom_gallery.ui.folder.data.FolderRepository {
    private final android.net.Uri contentUri = null;
    private final java.util.LinkedHashMap<java.lang.Long, dev.chu.custom_gallery.entity.Album> folderMap = null;
    private final java.lang.String[] projection = null;
    private final java.lang.String selection = "media_type=? OR media_type=?";
    private final java.lang.String[] selectionArgs = {"1"};
    private final java.lang.String sortOrder = "date_modified DESC";
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.HashMap<java.lang.Long, dev.chu.custom_gallery.entity.Album> fetchFolders(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Inject()
    public FolderRepositoryImpl() {
        super();
    }
}
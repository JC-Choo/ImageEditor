package dev.chu.custom_gallery.ui.folder.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/data/FolderRepository;", "", "fetchFolders", "Ljava/util/HashMap;", "", "Ldev/chu/custom_gallery/entity/Album;", "Lkotlin/collections/HashMap;", "context", "Landroid/content/Context;", "custom_gallery_debug"})
public abstract interface FolderRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.HashMap<java.lang.Long, dev.chu.custom_gallery.entity.Album> fetchFolders(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}
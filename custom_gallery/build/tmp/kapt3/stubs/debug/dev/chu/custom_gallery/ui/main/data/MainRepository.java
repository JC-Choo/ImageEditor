package dev.chu.custom_gallery.ui.main.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Ldev/chu/custom_gallery/ui/main/data/MainRepository;", "", "getCount", "Landroidx/lifecycle/LiveData;", "", "getItems", "Landroidx/paging/PagedList;", "Ldev/chu/custom_gallery/entity/MediaItem;", "app", "Landroid/app/Application;", "buckedId", "", "(Landroid/app/Application;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "custom_gallery_debug"})
public abstract interface MainRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<dev.chu.custom_gallery.entity.MediaItem>> getItems(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.Nullable()
    java.lang.Long buckedId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getCount();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
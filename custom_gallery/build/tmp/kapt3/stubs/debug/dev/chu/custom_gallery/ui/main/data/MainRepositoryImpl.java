package dev.chu.custom_gallery.ui.main.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J+\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldev/chu/custom_gallery/ui/main/data/MainRepositoryImpl;", "Ldev/chu/custom_gallery/ui/main/data/MainRepository;", "Ldev/chu/custom_gallery/entity/MediaItem$OnItemClickListener;", "callback", "Lkotlin/Function1;", "Ldev/chu/custom_gallery/entity/MediaItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "count", "Landroidx/lifecycle/MutableLiveData;", "", "getCount", "Landroidx/lifecycle/LiveData;", "getItems", "Landroidx/paging/PagedList;", "app", "Landroid/app/Application;", "buckedId", "", "(Landroid/app/Application;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "onItemClick", "item", "custom_gallery_debug"})
public final class MainRepositoryImpl implements dev.chu.custom_gallery.ui.main.data.MainRepository, dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> count = null;
    private final kotlin.jvm.functions.Function1<dev.chu.custom_gallery.entity.MediaItem, kotlin.Unit> callback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<dev.chu.custom_gallery.entity.MediaItem>> getItems(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.Nullable()
    java.lang.Long buckedId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Integer> getCount() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.MediaItem item) {
    }
    
    @javax.inject.Inject()
    public MainRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super dev.chu.custom_gallery.entity.MediaItem, kotlin.Unit> callback) {
        super();
    }
}
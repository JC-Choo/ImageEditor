package dev.chu.custom_gallery.util.paging;

import java.lang.System;

/**
 * DataSource.Factory:
 * [DataSource] 를 생성하는 역할
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/chu/custom_gallery/util/paging/LocalDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Ldev/chu/custom_gallery/entity/Media;", "contentResolver", "Landroid/content/ContentResolver;", "count", "Landroidx/lifecycle/MutableLiveData;", "buckedId", "", "(Landroid/content/ContentResolver;Landroidx/lifecycle/MutableLiveData;Ljava/lang/Long;)V", "Ljava/lang/Long;", "create", "Landroidx/paging/DataSource;", "custom_gallery_debug"})
public final class LocalDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, dev.chu.custom_gallery.entity.Media> {
    private final android.content.ContentResolver contentResolver = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> count = null;
    private java.lang.Long buckedId;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, dev.chu.custom_gallery.entity.Media> create() {
        return null;
    }
    
    public LocalDataSourceFactory(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> count, @org.jetbrains.annotations.Nullable()
    java.lang.Long buckedId) {
        super();
    }
}
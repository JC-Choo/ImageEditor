package dev.chu.custom_gallery.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\nH\u00d6\u0001J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0005J\u0019\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nH\u00d6\u0001R\"\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u000e\u0010\u0012R*\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ldev/chu/custom_gallery/entity/Selection;", "Landroid/os/Parcelable;", "items", "Ljava/util/LinkedHashMap;", "", "Ldev/chu/custom_gallery/entity/Media;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/util/LinkedHashMap;)V", "count", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getCount$annotations", "()V", "isUpThreeSelectedItem", "Ldev/chu/core/SingleLiveEvent;", "", "isUpThreeSelectedItem$annotations", "()Ldev/chu/core/SingleLiveEvent;", "clear", "", "describeContents", "deselect", "id", "getCount", "Landroidx/lifecycle/LiveData;", "isSelected", "select", "item", "toList", "", "toggle", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "custom_gallery_debug"})
public final class Selection implements android.os.Parcelable {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> count = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.chu.core.SingleLiveEvent<java.lang.Boolean> isUpThreeSelectedItem = null;
    private final java.util.LinkedHashMap<java.lang.Long, dev.chu.custom_gallery.entity.Media> items = null;
    public static final android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Selection> CREATOR = null;
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    private static void getCount$annotations() {
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void isUpThreeSelectedItem$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.core.SingleLiveEvent<java.lang.Boolean> isUpThreeSelectedItem() {
        return null;
    }
    
    private final void select(long id, dev.chu.custom_gallery.entity.Media item) {
    }
    
    private final void deselect(long id) {
    }
    
    public final void toggle(long id, @org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.entity.Media item) {
    }
    
    public final boolean isSelected(long id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.chu.custom_gallery.entity.Media> toList() {
        return null;
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCount() {
        return null;
    }
    
    public Selection(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.Long, dev.chu.custom_gallery.entity.Media> items) {
        super();
    }
    
    public Selection() {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Selection> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Selection[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Selection createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}
package dev.chu.custom_gallery.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jd\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\nH\u00d6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\nH\u00d6\u0001J\u0006\u0010/\u001a\u000200J\t\u00101\u001a\u00020\bH\u00d6\u0001J\u0019\u00102\u001a\u0002002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019\u00a8\u00066"}, d2 = {"Ldev/chu/custom_gallery/entity/Album;", "Landroid/os/Parcelable;", "contentUri", "Landroid/net/Uri;", "recentMediaId", "", "bucketId", "name", "", "count", "", "order", "relativePath", "data", "(Landroid/net/Uri;JLjava/lang/Long;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V", "getBucketId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContentUri", "()Landroid/net/Uri;", "getCount", "()I", "setCount", "(I)V", "getData", "()Ljava/lang/String;", "getName", "getOrder", "()J", "getRecentMediaId", "getRelativePath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Landroid/net/Uri;JLjava/lang/Long;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;)Ldev/chu/custom_gallery/entity/Album;", "describeContents", "equals", "", "other", "", "hashCode", "increaseCount", "", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "custom_gallery_debug"})
public final class Album implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri contentUri = null;
    private final long recentMediaId = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long bucketId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private int count;
    private final long order = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String relativePath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String data = null;
    public static final android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Album> CREATOR = null;
    
    public final void increaseCount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getContentUri() {
        return null;
    }
    
    public final long getRecentMediaId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBucketId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final long getOrder() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelativePath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData() {
        return null;
    }
    
    public Album(@org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, long recentMediaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long bucketId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int count, long order, @org.jetbrains.annotations.Nullable()
    java.lang.String relativePath, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.Album copy(@org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, long recentMediaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long bucketId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int count, long order, @org.jetbrains.annotations.Nullable()
    java.lang.String relativePath, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
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
    public static final class Creator implements android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Album> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Album[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Album createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}
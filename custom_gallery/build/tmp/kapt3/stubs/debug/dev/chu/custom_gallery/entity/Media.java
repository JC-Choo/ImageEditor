package dev.chu.custom_gallery.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00106\u001a\u00020\u0015H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\nH\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u00b0\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\t\u0010A\u001a\u00020\nH\u00d6\u0001J\u0013\u0010B\u001a\u00020\u00152\b\u0010C\u001a\u0004\u0018\u00010DH\u00d6\u0003J\u0006\u0010E\u001a\u00020\u0003J\t\u0010F\u001a\u00020\nH\u00d6\u0001J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010$\"\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b/\u0010!\u00a8\u0006M"}, d2 = {"Ldev/chu/custom_gallery/entity/Media;", "Landroid/os/Parcelable;", "contentUri", "Landroid/net/Uri;", "id", "", "name", "", "relativePath", "mediaType", "", "mimeType", "dateModified", "dateTaken", "dateAdded", "width", "height", "orientation", "size", "duration", "isSelected", "", "(Landroid/net/Uri;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Long;Z)V", "getContentUri", "()Landroid/net/Uri;", "getDateAdded", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDateModified", "()J", "getDateTaken", "getDuration", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Z", "setSelected", "(Z)V", "getMediaType", "()I", "getMimeType", "()Ljava/lang/String;", "getName", "getOrientation", "getRelativePath", "getSize", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Landroid/net/Uri;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Long;Z)Ldev/chu/custom_gallery/entity/Media;", "describeContents", "equals", "other", "", "getUri", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "custom_gallery_debug"})
public final class Media implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri contentUri = null;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String relativePath = null;
    private final int mediaType = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mimeType = null;
    private final long dateModified = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dateTaken = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dateAdded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer width = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer height = null;
    private final int orientation = 0;
    private final int size = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long duration = null;
    private boolean isSelected;
    public static final android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Media> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getContentUri() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRelativePath() {
        return null;
    }
    
    public final int getMediaType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimeType() {
        return null;
    }
    
    public final long getDateModified() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateTaken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    public final int getOrientation() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDuration() {
        return null;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public Media(@org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String relativePath, int mediaType, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, long dateModified, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateTaken, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer width, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height, int orientation, int size, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration, boolean isSelected) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.entity.Media copy(@org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String relativePath, int mediaType, @org.jetbrains.annotations.NotNull()
    java.lang.String mimeType, long dateModified, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateTaken, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer width, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height, int orientation, int size, @org.jetbrains.annotations.Nullable()
    java.lang.Long duration, boolean isSelected) {
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
    public static final class Creator implements android.os.Parcelable.Creator<dev.chu.custom_gallery.entity.Media> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Media[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final dev.chu.custom_gallery.entity.Media createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}
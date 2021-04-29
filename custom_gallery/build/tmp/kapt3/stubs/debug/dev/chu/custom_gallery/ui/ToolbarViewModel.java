package dev.chu.custom_gallery.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R*\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00148G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R&\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR&\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R&\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR,\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068G@FX\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u00062"}, d2 = {"Ldev/chu/custom_gallery/ui/ToolbarViewModel;", "Landroidx/databinding/BaseObservable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "backgroundColor", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "", "isRightVisible", "()Z", "setRightVisible", "(Z)V", "leftImageDrawable", "getLeftImageDrawable", "setLeftImageDrawable", "Landroid/view/View$OnClickListener;", "onClickLeft", "getOnClickLeft", "()Landroid/view/View$OnClickListener;", "setOnClickLeft", "(Landroid/view/View$OnClickListener;)V", "onClickRight", "getOnClickRight", "setOnClickRight", "onClickTitle", "getOnClickTitle", "setOnClickTitle", "rightImageDrawable", "getRightImageDrawable", "setRightImageDrawable", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "titleColor", "getTitleColor", "setTitleColor", "titleDrawableRight", "getTitleDrawableRight", "()Ljava/lang/Integer;", "setTitleDrawableRight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "custom_gallery_debug"})
public final class ToolbarViewModel extends androidx.databinding.BaseObservable {
    @androidx.annotation.DrawableRes()
    private int leftImageDrawable = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    private java.lang.Integer titleDrawableRight;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int rightImageDrawable = 0;
    private boolean isRightVisible = false;
    private int backgroundColor;
    private int titleColor = 0;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener onClickLeft;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener onClickTitle;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener onClickRight;
    private final android.content.Context context = null;
    
    @androidx.databinding.Bindable()
    public final int getLeftImageDrawable() {
        return 0;
    }
    
    public final void setLeftImageDrawable(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final java.lang.Integer getTitleDrawableRight() {
        return null;
    }
    
    public final void setTitleDrawableRight(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.Bindable()
    public final int getRightImageDrawable() {
        return 0;
    }
    
    public final void setRightImageDrawable(int value) {
    }
    
    @androidx.databinding.Bindable()
    public final boolean isRightVisible() {
        return false;
    }
    
    public final void setRightVisible(boolean value) {
    }
    
    @androidx.databinding.Bindable()
    public final int getBackgroundColor() {
        return 0;
    }
    
    public final void setBackgroundColor(int value) {
    }
    
    @androidx.databinding.Bindable()
    public final int getTitleColor() {
        return 0;
    }
    
    public final void setTitleColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final android.view.View.OnClickListener getOnClickLeft() {
        return null;
    }
    
    public final void setOnClickLeft(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final android.view.View.OnClickListener getOnClickTitle() {
        return null;
    }
    
    public final void setOnClickTitle(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    public final android.view.View.OnClickListener getOnClickRight() {
        return null;
    }
    
    public final void setOnClickRight(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener value) {
    }
    
    public ToolbarViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}
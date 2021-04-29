package dev.chu.custom_gallery.util.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ldev/chu/custom_gallery/util/permission/PermissionCheck;", "", "()V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "", "requestPermissionLauncher", "", "internalLaunch", "launch", "Companion", "custom_gallery_debug"})
public final class PermissionCheck {
    private androidx.activity.result.ActivityResultLauncher<kotlin.Unit> launcher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher;
    private static final java.lang.String PERMISSION = "android.permission.READ_EXTERNAL_STORAGE";
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.util.permission.PermissionCheck.Companion Companion = null;
    
    private final void internalLaunch() {
    }
    
    public final void launch() {
    }
    
    public PermissionCheck() {
        super();
    }
    
    private static final dev.chu.custom_gallery.util.permission.PermissionCheck register(androidx.activity.ComponentActivity activity, kotlin.jvm.functions.Function1<? super java.util.ArrayList<dev.chu.custom_gallery.entity.Media>, kotlin.Unit> successCallback, kotlin.jvm.functions.Function0<kotlin.Unit> failCallback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.util.permission.PermissionCheck register(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<dev.chu.custom_gallery.entity.Media>, kotlin.Unit> successCallback) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0004\u0012\u00020\u000e0\nH\u0007JB\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0003J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Ldev/chu/custom_gallery/util/permission/PermissionCheck$Companion;", "", "()V", "PERMISSION", "", "register", "Ldev/chu/custom_gallery/util/permission/PermissionCheck;", "activity", "Landroidx/activity/ComponentActivity;", "successCallback", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Ldev/chu/custom_gallery/entity/Media;", "Lkotlin/collections/ArrayList;", "", "failCallback", "Lkotlin/Function0;", "showDialogToGetPermissionFromSystemSetting", "Landroid/app/Activity;", "custom_gallery_debug"})
    public static final class Companion {
        
        private final dev.chu.custom_gallery.util.permission.PermissionCheck register(androidx.activity.ComponentActivity activity, kotlin.jvm.functions.Function1<? super java.util.ArrayList<dev.chu.custom_gallery.entity.Media>, kotlin.Unit> successCallback, kotlin.jvm.functions.Function0<kotlin.Unit> failCallback) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final dev.chu.custom_gallery.util.permission.PermissionCheck register(@org.jetbrains.annotations.NotNull()
        androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.ArrayList<dev.chu.custom_gallery.entity.Media>, kotlin.Unit> successCallback) {
            return null;
        }
        
        private final void showDialogToGetPermissionFromSystemSetting(android.app.Activity activity) {
        }
        
        private Companion() {
            super();
        }
    }
}
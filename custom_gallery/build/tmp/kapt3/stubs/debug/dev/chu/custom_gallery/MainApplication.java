package dev.chu.custom_gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Ldev/chu/custom_gallery/MainApplication;", "Ldagger/android/DaggerApplication;", "()V", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "Companion", "custom_gallery_debug"})
public final class MainApplication extends dagger.android.DaggerApplication {
    private static volatile dev.chu.custom_gallery.MainApplication instance;
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.MainApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public MainApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldev/chu/custom_gallery/MainApplication$Companion;", "", "()V", "instance", "Ldev/chu/custom_gallery/MainApplication;", "get", "custom_gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final dev.chu.custom_gallery.MainApplication get() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
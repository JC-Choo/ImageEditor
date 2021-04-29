package dev.chu.custom_gallery.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Ldev/chu/custom_gallery/di/AppModule;", "", "()V", "provideApplication", "Landroid/app/Application;", "app", "Ldev/chu/custom_gallery/MainApplication;", "provideContext", "Landroid/content/Context;", "custom_gallery_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.app.Application provideApplication(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.MainApplication app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @dev.chu.core.di.ForApplication()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.MainApplication app) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}
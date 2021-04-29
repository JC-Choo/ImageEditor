package dev.chu.custom_gallery.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2 = {"Ldev/chu/custom_gallery/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldev/chu/custom_gallery/MainApplication;", "()V", "Factory", "custom_gallery_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, dev.chu.custom_gallery.di.AppModule.class, dev.chu.custom_gallery.di.ActivityModule.class, dev.chu.core.di.ViewModelModule.class})
@javax.inject.Singleton()
public abstract class AppComponent implements dagger.android.AndroidInjector<dev.chu.custom_gallery.MainApplication> {
    
    public AppComponent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Ldev/chu/custom_gallery/di/AppComponent$Factory;", "Ldagger/android/AndroidInjector$Factory;", "Ldev/chu/custom_gallery/MainApplication;", "()V", "custom_gallery_debug"})
    @dagger.Component.Factory()
    public static abstract class Factory implements dagger.android.AndroidInjector.Factory<dev.chu.custom_gallery.MainApplication> {
        
        public Factory() {
            super();
        }
    }
}
package dev.chu.custom_gallery.ui.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Ldev/chu/custom_gallery/ui/di/GalleryModule;", "", "()V", "folderFragment", "Ldev/chu/custom_gallery/ui/folder/FolderFragment;", "mainFragment", "Ldev/chu/custom_gallery/ui/main/MainFragment;", "Companion", "custom_gallery_debug"})
@dagger.Module()
public abstract class GalleryModule {
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.ui.di.GalleryModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {dev.chu.custom_gallery.ui.main.di.MainModule.class})
    @dev.chu.core.di.FragmentScope()
    public abstract dev.chu.custom_gallery.ui.main.MainFragment mainFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {dev.chu.custom_gallery.ui.folder.di.FolderModule.class})
    @dev.chu.core.di.FragmentScope()
    public abstract dev.chu.custom_gallery.ui.folder.FolderFragment folderFragment();
    
    public GalleryModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ldev/chu/custom_gallery/ui/di/GalleryModule$Companion;", "", "()V", "provideGallerySharedViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "a", "Ldev/chu/custom_gallery/ui/GalleryActivity;", "custom_gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dev.chu.core.di.SharedViewModelProvider()
        @dev.chu.core.di.ActivityScope()
        @dagger.Provides()
        public final androidx.lifecycle.ViewModelProvider provideGallerySharedViewModelProvider(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.ui.GalleryActivity a) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
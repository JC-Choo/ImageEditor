package dev.chu.custom_gallery.ui.main.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Ldev/chu/custom_gallery/ui/main/di/MainModule;", "", "()V", "bindMainViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/chu/custom_gallery/ui/main/MainViewModel;", "Companion", "custom_gallery_debug"})
@dagger.Module()
public abstract class MainModule {
    @org.jetbrains.annotations.NotNull()
    public static final dev.chu.custom_gallery.ui.main.di.MainModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dev.chu.core.di.ViewModelKey(value = dev.chu.custom_gallery.ui.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.main.MainViewModel viewModel);
    
    public MainModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Ldev/chu/custom_gallery/ui/main/di/MainModule$Companion;", "", "()V", "provideMainViewModel", "Ldev/chu/custom_gallery/ui/main/MainViewModel;", "f", "Ldev/chu/custom_gallery/ui/main/MainFragment;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "provideToolbarViewModel", "Ldev/chu/custom_gallery/ui/ToolbarViewModel;", "custom_gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dev.chu.core.di.ViewModelInject()
        @dagger.Provides()
        public final dev.chu.custom_gallery.ui.main.MainViewModel provideMainViewModel(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.ui.main.MainFragment f, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModelProvider.Factory factory) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dev.chu.core.di.FragmentScope()
        @dagger.Provides()
        public final dev.chu.custom_gallery.ui.ToolbarViewModel provideToolbarViewModel(@org.jetbrains.annotations.NotNull()
        dev.chu.custom_gallery.ui.main.MainFragment f) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
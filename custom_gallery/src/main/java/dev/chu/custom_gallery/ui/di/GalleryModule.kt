package dev.chu.custom_gallery.ui.di

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dev.chu.core.di.ActivityScope
import dev.chu.core.di.FragmentScope
import dev.chu.core.di.SharedViewModelProvider
import dev.chu.custom_gallery.ui.GalleryActivity
import dev.chu.custom_gallery.ui.folder.FolderFragment
import dev.chu.custom_gallery.ui.folder.di.FolderModule
import dev.chu.custom_gallery.ui.main.MainFragment
import dev.chu.custom_gallery.ui.main.di.MainModule

@Module
abstract class GalleryModule {

    companion object {
        @Provides
        @ActivityScope
        @SharedViewModelProvider
        fun provideGallerySharedViewModelProvider(
            a: GalleryActivity
        ) = ViewModelProvider(a)
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [FolderModule::class])
    abstract fun folderFragment(): FolderFragment
}
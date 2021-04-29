package dev.chu.custom_gallery.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.chu.core.di.ActivityScope
import dev.chu.custom_gallery.ui.GalleryActivity
import dev.chu.custom_gallery.ui.di.GalleryModule

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [GalleryModule::class])
    abstract fun galleryActivity(): GalleryActivity
}

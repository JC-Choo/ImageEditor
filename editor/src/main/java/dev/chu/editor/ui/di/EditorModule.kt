package dev.chu.editor.ui.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.chu.core.di.FragmentScope
import dev.chu.editor.ui.edit.ui.EditFragment
import dev.chu.editor.ui.edit.di.EditModule
import dev.chu.editor.ui.main.ui.MainFragment
import dev.chu.editor.ui.main.di.MainModule

@Module
abstract class EditorModule {

//    companion object {
//        @Provides
//        @ActivityScope
//        @SharedViewModelProvider
//        fun provideGallerySharedViewModelProvider(
//            a: GalleryActivity
//        ) = ViewModelProvider(a)
//    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [EditModule::class])
    abstract fun editFragment(): EditFragment
}
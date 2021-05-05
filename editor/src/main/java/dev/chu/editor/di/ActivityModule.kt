package dev.chu.editor.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.chu.core.di.ActivityScope
import dev.chu.editor.ui.EditorActivity
import dev.chu.editor.ui.di.EditorModule

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [EditorModule::class])
    abstract fun editorActivity(): EditorActivity
}

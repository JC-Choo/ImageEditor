package dev.chu.editor.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dev.chu.core.di.ForApplication
import dev.chu.editor.MainApplication

@Module
class AppModule {
    @Provides
    fun provideApplication(app: MainApplication): Application = app

    @ForApplication
    @Provides
    fun provideContext(app: MainApplication): Context = app
}
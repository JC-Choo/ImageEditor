package dev.chu.custom_gallery.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dev.chu.core.di.ForApplication
import dev.chu.custom_gallery.MainApplication

@Module
class AppModule {
    @Provides
    fun provideApplication(app: MainApplication): Application = app

    @ForApplication
    @Provides
    fun provideContext(app: MainApplication): Context = app
}
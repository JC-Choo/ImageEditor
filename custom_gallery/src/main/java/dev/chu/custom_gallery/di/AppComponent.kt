package dev.chu.custom_gallery.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dev.chu.core.di.ViewModelModule
import dev.chu.custom_gallery.MainApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class,
    ViewModelModule::class
])
abstract class AppComponent: AndroidInjector<MainApplication> {
    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<MainApplication>
}
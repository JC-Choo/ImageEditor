package dev.chu.custom_gallery

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.chu.custom_gallery.di.DaggerAppComponent

class MainApplication: DaggerApplication() {

    companion object {
        @Volatile
        private var instance: MainApplication? = null

        fun get(): MainApplication {
            if (instance == null)
                synchronized(this) {
                    instance = MainApplication()
                }
            return instance!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
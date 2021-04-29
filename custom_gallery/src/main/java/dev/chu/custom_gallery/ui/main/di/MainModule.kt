package dev.chu.custom_gallery.ui.main.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dev.chu.core.di.FragmentScope
import dev.chu.core.di.ViewModelInject
import dev.chu.core.di.ViewModelKey
import dev.chu.core.util.ext.getColorById
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.ui.ToolbarViewModel
import dev.chu.custom_gallery.ui.main.MainFragment
import dev.chu.custom_gallery.ui.main.MainViewModel

@Module
abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    companion object {
        @Provides
        @ViewModelInject
        fun provideMainViewModel(
            f: MainFragment,
            factory: ViewModelProvider.Factory
        ): MainViewModel {
            return ViewModelProvider(f, factory).get()
        }

        @Provides
        @FragmentScope
        fun provideToolbarViewModel(
            f: MainFragment
        ) = ToolbarViewModel(f.requireContext()).apply {
            leftImageDrawable = R.drawable.close_000000
            titleDrawableRight = R.drawable.expand_more_000000
            rightImageDrawable = R.drawable.check_000000

            backgroundColor = f.requireContext().getColorById(R.color.white)
            titleColor = f.requireContext().getColorById(R.color.color_222222)
        }
    }
}
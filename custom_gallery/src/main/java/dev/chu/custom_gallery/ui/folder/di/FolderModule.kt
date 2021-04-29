package dev.chu.custom_gallery.ui.folder.di

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
import dev.chu.custom_gallery.ui.folder.FolderFragment
import dev.chu.custom_gallery.ui.folder.FolderViewModel

@Module
abstract class FolderModule {
    @Binds
    @IntoMap
    @ViewModelKey(FolderViewModel::class)
    abstract fun bindFolderViewModel(vm: FolderViewModel): ViewModel

    companion object {
        @Provides
        @ViewModelInject
        fun provideFolderViewModel(
            f: FolderFragment,
            factory: ViewModelProvider.Factory
        ): FolderViewModel {
            return ViewModelProvider(f, factory).get()
        }

        @Provides
        @FragmentScope
        fun provideToolbarViewModel(
            f: FolderFragment
        ) = ToolbarViewModel(f.requireContext()).apply {
            title = f.requireContext().getString(R.string.all_album)
            leftImageDrawable = R.drawable.arrow_back_000000
            titleDrawableRight = R.drawable.expand_less_000000

            backgroundColor = f.requireContext().getColorById(R.color.white)
            titleColor = f.requireContext().getColorById(R.color.color_222222)
        }
    }
}
package dev.chu.custom_gallery.ui.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.chu.core.di.FragmentScope;
import dev.chu.custom_gallery.ui.folder.FolderFragment;
import dev.chu.custom_gallery.ui.folder.di.FolderModule;

@Module(subcomponents = GalleryModule_FolderFragment.FolderFragmentSubcomponent.class)
public abstract class GalleryModule_FolderFragment {
  private GalleryModule_FolderFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FolderFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FolderFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = FolderModule.class)
  @FragmentScope
  public interface FolderFragmentSubcomponent extends AndroidInjector<FolderFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FolderFragment> {}
  }
}

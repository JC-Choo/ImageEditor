package dev.chu.custom_gallery.ui.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.chu.core.di.FragmentScope;
import dev.chu.custom_gallery.ui.main.MainFragment;
import dev.chu.custom_gallery.ui.main.di.MainModule;

@Module(subcomponents = GalleryModule_MainFragment.MainFragmentSubcomponent.class)
public abstract class GalleryModule_MainFragment {
  private GalleryModule_MainFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MainFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = MainModule.class)
  @FragmentScope
  public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainFragment> {}
  }
}

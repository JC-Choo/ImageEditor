package dev.chu.custom_gallery.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dev.chu.core.di.ActivityScope;
import dev.chu.custom_gallery.ui.GalleryActivity;
import dev.chu.custom_gallery.ui.di.GalleryModule;

@Module(subcomponents = ActivityModule_GalleryActivity.GalleryActivitySubcomponent.class)
public abstract class ActivityModule_GalleryActivity {
  private ActivityModule_GalleryActivity() {}

  @Binds
  @IntoMap
  @ClassKey(GalleryActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GalleryActivitySubcomponent.Factory builder);

  @Subcomponent(modules = GalleryModule.class)
  @ActivityScope
  public interface GalleryActivitySubcomponent extends AndroidInjector<GalleryActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<GalleryActivity> {}
  }
}

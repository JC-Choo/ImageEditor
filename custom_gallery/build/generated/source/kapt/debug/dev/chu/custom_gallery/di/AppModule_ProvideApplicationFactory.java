// Generated by Dagger (https://dagger.dev).
package dev.chu.custom_gallery.di;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.chu.custom_gallery.MainApplication;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
  private final AppModule module;

  private final Provider<MainApplication> appProvider;

  public AppModule_ProvideApplicationFactory(AppModule module,
      Provider<MainApplication> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Application get() {
    return provideApplication(module, appProvider.get());
  }

  public static AppModule_ProvideApplicationFactory create(AppModule module,
      Provider<MainApplication> appProvider) {
    return new AppModule_ProvideApplicationFactory(module, appProvider);
  }

  public static Application provideApplication(AppModule instance, MainApplication app) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplication(app));
  }
}
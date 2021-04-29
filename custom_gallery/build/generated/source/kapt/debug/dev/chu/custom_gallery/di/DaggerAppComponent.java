// Generated by Dagger (https://dagger.dev).
package dev.chu.custom_gallery.di;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dev.chu.core.di.ViewModelFactory;
import dev.chu.custom_gallery.MainApplication;
import dev.chu.custom_gallery.ui.GalleryActivity;
import dev.chu.custom_gallery.ui.ToolbarViewModel;
import dev.chu.custom_gallery.ui.di.GalleryModule_Companion_ProvideGallerySharedViewModelProviderFactory;
import dev.chu.custom_gallery.ui.di.GalleryModule_FolderFragment;
import dev.chu.custom_gallery.ui.di.GalleryModule_MainFragment;
import dev.chu.custom_gallery.ui.folder.FolderFragment;
import dev.chu.custom_gallery.ui.folder.FolderFragment_MembersInjector;
import dev.chu.custom_gallery.ui.folder.FolderViewModel;
import dev.chu.custom_gallery.ui.folder.FolderViewModel_Factory;
import dev.chu.custom_gallery.ui.folder.data.FolderRepositoryImpl_Factory;
import dev.chu.custom_gallery.ui.folder.di.FolderModule_Companion_ProvideFolderViewModelFactory;
import dev.chu.custom_gallery.ui.folder.di.FolderModule_Companion_ProvideToolbarViewModelFactory;
import dev.chu.custom_gallery.ui.main.MainFragment;
import dev.chu.custom_gallery.ui.main.MainFragment_MembersInjector;
import dev.chu.custom_gallery.ui.main.MainViewModel;
import dev.chu.custom_gallery.ui.main.MainViewModel_Factory;
import dev.chu.custom_gallery.ui.main.di.MainModule_Companion_ProvideMainViewModelFactory;
import dev.chu.custom_gallery.ui.main.di.MainModule_Companion_ProvideToolbarViewModelFactory;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent extends AppComponent {
  private Provider<ActivityModule_GalleryActivity.GalleryActivitySubcomponent.Factory> galleryActivitySubcomponentFactoryProvider;

  private Provider<MainApplication> arg0Provider;

  private Provider<Application> provideApplicationProvider;

  private DaggerAppComponent(AppModule appModuleParam, MainApplication arg0Param) {

    initialize(appModuleParam, arg0Param);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(GalleryActivity.class, (Provider) galleryActivitySubcomponentFactoryProvider);
  }

  private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final MainApplication arg0Param) {
    this.galleryActivitySubcomponentFactoryProvider = new Provider<ActivityModule_GalleryActivity.GalleryActivitySubcomponent.Factory>() {
      @Override
      public ActivityModule_GalleryActivity.GalleryActivitySubcomponent.Factory get() {
        return new GalleryActivitySubcomponentFactory();
      }
    };
    this.arg0Provider = InstanceFactory.create(arg0Param);
    this.provideApplicationProvider = AppModule_ProvideApplicationFactory.create(appModuleParam, arg0Provider);
  }

  @Override
  public void inject(MainApplication arg0) {
    injectMainApplication(arg0);
  }

  private MainApplication injectMainApplication(MainApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory extends AppComponent.Factory {
    @Override
    public AppComponent create(MainApplication arg0) {
      Preconditions.checkNotNull(arg0);
      return new DaggerAppComponent(new AppModule(), arg0);
    }
  }

  private final class GalleryActivitySubcomponentFactory implements ActivityModule_GalleryActivity.GalleryActivitySubcomponent.Factory {
    @Override
    public ActivityModule_GalleryActivity.GalleryActivitySubcomponent create(GalleryActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new GalleryActivitySubcomponentImpl(arg0);
    }
  }

  private final class GalleryActivitySubcomponentImpl implements ActivityModule_GalleryActivity.GalleryActivitySubcomponent {
    private Provider<GalleryModule_MainFragment.MainFragmentSubcomponent.Factory> mainFragmentSubcomponentFactoryProvider;

    private Provider<GalleryModule_FolderFragment.FolderFragmentSubcomponent.Factory> folderFragmentSubcomponentFactoryProvider;

    private Provider<GalleryActivity> arg0Provider;

    private Provider<ViewModelProvider> provideGallerySharedViewModelProvider;

    private GalleryActivitySubcomponentImpl(GalleryActivity arg0Param) {

      initialize(arg0Param);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(3).put(GalleryActivity.class, (Provider) DaggerAppComponent.this.galleryActivitySubcomponentFactoryProvider).put(MainFragment.class, (Provider) mainFragmentSubcomponentFactoryProvider).put(FolderFragment.class, (Provider) folderFragmentSubcomponentFactoryProvider).build();
    }

    private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final GalleryActivity arg0Param) {
      this.mainFragmentSubcomponentFactoryProvider = new Provider<GalleryModule_MainFragment.MainFragmentSubcomponent.Factory>() {
        @Override
        public GalleryModule_MainFragment.MainFragmentSubcomponent.Factory get() {
          return new MainFragmentSubcomponentFactory();
        }
      };
      this.folderFragmentSubcomponentFactoryProvider = new Provider<GalleryModule_FolderFragment.FolderFragmentSubcomponent.Factory>() {
        @Override
        public GalleryModule_FolderFragment.FolderFragmentSubcomponent.Factory get() {
          return new FolderFragmentSubcomponentFactory();
        }
      };
      this.arg0Provider = InstanceFactory.create(arg0Param);
      this.provideGallerySharedViewModelProvider = DoubleCheck.provider(GalleryModule_Companion_ProvideGallerySharedViewModelProviderFactory.create(arg0Provider));
    }

    @Override
    public void inject(GalleryActivity arg0) {
      injectGalleryActivity(arg0);
    }

    private GalleryActivity injectGalleryActivity(GalleryActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      return instance;
    }

    private final class MainFragmentSubcomponentFactory implements GalleryModule_MainFragment.MainFragmentSubcomponent.Factory {
      @Override
      public GalleryModule_MainFragment.MainFragmentSubcomponent create(MainFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new MainFragmentSubcomponentImpl(arg0);
      }
    }

    private final class MainFragmentSubcomponentImpl implements GalleryModule_MainFragment.MainFragmentSubcomponent {
      private final MainFragment arg0;

      private Provider<MainViewModel> mainViewModelProvider;

      private Provider<MainFragment> arg0Provider;

      private Provider<ToolbarViewModel> provideToolbarViewModelProvider;

      private MainFragmentSubcomponentImpl(MainFragment arg0Param) {
        this.arg0 = arg0Param;
        initialize(arg0Param);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel(
          ) {
        return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(MainViewModel.class, (Provider) mainViewModelProvider);
      }

      private ViewModelFactory viewModelFactory() {
        return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
      }

      private MainViewModel viewModelInjectMainViewModel() {
        return MainModule_Companion_ProvideMainViewModelFactory.provideMainViewModel(arg0, viewModelFactory());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final MainFragment arg0Param) {
        this.mainViewModelProvider = MainViewModel_Factory.create(DaggerAppComponent.this.provideApplicationProvider);
        this.arg0Provider = InstanceFactory.create(arg0Param);
        this.provideToolbarViewModelProvider = DoubleCheck.provider(MainModule_Companion_ProvideToolbarViewModelFactory.create(arg0Provider));
      }

      @Override
      public void inject(MainFragment arg0) {
        injectMainFragment(arg0);
      }

      private MainFragment injectMainFragment(MainFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, GalleryActivitySubcomponentImpl.this.dispatchingAndroidInjectorOfObject());
        MainFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
        MainFragment_MembersInjector.injectViewModel(instance, viewModelInjectMainViewModel());
        MainFragment_MembersInjector.injectSharedViewModelProvider(instance, GalleryActivitySubcomponentImpl.this.provideGallerySharedViewModelProvider.get());
        MainFragment_MembersInjector.injectToolbarVM(instance, provideToolbarViewModelProvider.get());
        return instance;
      }
    }

    private final class FolderFragmentSubcomponentFactory implements GalleryModule_FolderFragment.FolderFragmentSubcomponent.Factory {
      @Override
      public GalleryModule_FolderFragment.FolderFragmentSubcomponent create(FolderFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new FolderFragmentSubcomponentImpl(arg0);
      }
    }

    private final class FolderFragmentSubcomponentImpl implements GalleryModule_FolderFragment.FolderFragmentSubcomponent {
      private final FolderFragment arg0;

      private Provider<FolderViewModel> folderViewModelProvider;

      private Provider<FolderFragment> arg0Provider;

      private Provider<ToolbarViewModel> provideToolbarViewModelProvider;

      private FolderFragmentSubcomponentImpl(FolderFragment arg0Param) {
        this.arg0 = arg0Param;
        initialize(arg0Param);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel(
          ) {
        return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(FolderViewModel.class, (Provider) folderViewModelProvider);
      }

      private ViewModelFactory viewModelFactory() {
        return new ViewModelFactory(mapOfClassOfAndProviderOfViewModel());
      }

      private FolderViewModel viewModelInjectFolderViewModel() {
        return FolderModule_Companion_ProvideFolderViewModelFactory.provideFolderViewModel(arg0, viewModelFactory());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final FolderFragment arg0Param) {
        this.folderViewModelProvider = FolderViewModel_Factory.create(DaggerAppComponent.this.provideApplicationProvider, FolderRepositoryImpl_Factory.create());
        this.arg0Provider = InstanceFactory.create(arg0Param);
        this.provideToolbarViewModelProvider = DoubleCheck.provider(FolderModule_Companion_ProvideToolbarViewModelFactory.create(arg0Provider));
      }

      @Override
      public void inject(FolderFragment arg0) {
        injectFolderFragment(arg0);
      }

      private FolderFragment injectFolderFragment(FolderFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, GalleryActivitySubcomponentImpl.this.dispatchingAndroidInjectorOfObject());
        FolderFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactory());
        FolderFragment_MembersInjector.injectViewModel(instance, viewModelInjectFolderViewModel());
        FolderFragment_MembersInjector.injectToolbarVM(instance, provideToolbarViewModelProvider.get());
        FolderFragment_MembersInjector.injectSharedViewModelProvider(instance, GalleryActivitySubcomponentImpl.this.provideGallerySharedViewModelProvider.get());
        return instance;
      }
    }
  }
}

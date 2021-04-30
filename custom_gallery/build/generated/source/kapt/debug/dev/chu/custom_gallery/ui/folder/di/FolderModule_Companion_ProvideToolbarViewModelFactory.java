// Generated by Dagger (https://dagger.dev).
package dev.chu.custom_gallery.ui.folder.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.chu.custom_gallery.ui.ToolbarViewModel;
import dev.chu.custom_gallery.ui.folder.FolderFragment;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FolderModule_Companion_ProvideToolbarViewModelFactory implements Factory<ToolbarViewModel> {
  private final Provider<FolderFragment> fProvider;

  public FolderModule_Companion_ProvideToolbarViewModelFactory(Provider<FolderFragment> fProvider) {
    this.fProvider = fProvider;
  }

  @Override
  public ToolbarViewModel get() {
    return provideToolbarViewModel(fProvider.get());
  }

  public static FolderModule_Companion_ProvideToolbarViewModelFactory create(
      Provider<FolderFragment> fProvider) {
    return new FolderModule_Companion_ProvideToolbarViewModelFactory(fProvider);
  }

  public static ToolbarViewModel provideToolbarViewModel(FolderFragment f) {
    return Preconditions.checkNotNullFromProvides(FolderModule.Companion.provideToolbarViewModel(f));
  }
}
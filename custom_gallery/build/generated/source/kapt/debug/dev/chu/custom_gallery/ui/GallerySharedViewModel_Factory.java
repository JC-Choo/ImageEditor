// Generated by Dagger (https://dagger.dev).
package dev.chu.custom_gallery.ui;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GallerySharedViewModel_Factory implements Factory<GallerySharedViewModel> {
  @Override
  public GallerySharedViewModel get() {
    return newInstance();
  }

  public static GallerySharedViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GallerySharedViewModel newInstance() {
    return new GallerySharedViewModel();
  }

  private static final class InstanceHolder {
    private static final GallerySharedViewModel_Factory INSTANCE = new GallerySharedViewModel_Factory();
  }
}

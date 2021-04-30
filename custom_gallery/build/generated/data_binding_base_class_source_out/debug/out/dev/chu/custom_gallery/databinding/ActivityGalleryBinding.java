// Generated by data binding compiler. Do not edit!
package dev.chu.custom_gallery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import dev.chu.custom_gallery.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityGalleryBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FragmentContainerView navHostFragment;

  protected ActivityGalleryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout container, FragmentContainerView navHostFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.navHostFragment = navHostFragment;
  }

  @NonNull
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityGalleryBinding>inflateInternal(inflater, R.layout.activity_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityGalleryBinding>inflateInternal(inflater, R.layout.activity_gallery, null, false, component);
  }

  public static ActivityGalleryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityGalleryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityGalleryBinding)bind(component, view, R.layout.activity_gallery);
  }
}
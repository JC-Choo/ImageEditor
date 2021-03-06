// Generated by data binding compiler. Do not edit!
package dev.chu.custom_gallery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.ui.ToolbarViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class IncludeToolbarBinding extends ViewDataBinding {
  @NonNull
  public final ImageView complete;

  @NonNull
  public final ImageView leftImage;

  @NonNull
  public final TextView title;

  @Bindable
  protected ToolbarViewModel mToolbarVM;

  protected IncludeToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView complete, ImageView leftImage, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.complete = complete;
    this.leftImage = leftImage;
    this.title = title;
  }

  public abstract void setToolbarVM(@Nullable ToolbarViewModel toolbarVM);

  @Nullable
  public ToolbarViewModel getToolbarVM() {
    return mToolbarVM;
  }

  @NonNull
  public static IncludeToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_toolbar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static IncludeToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<IncludeToolbarBinding>inflateInternal(inflater, R.layout.include_toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static IncludeToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.include_toolbar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static IncludeToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<IncludeToolbarBinding>inflateInternal(inflater, R.layout.include_toolbar, null, false, component);
  }

  public static IncludeToolbarBinding bind(@NonNull View view) {
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
  public static IncludeToolbarBinding bind(@NonNull View view, @Nullable Object component) {
    return (IncludeToolbarBinding)bind(component, view, R.layout.include_toolbar);
  }
}

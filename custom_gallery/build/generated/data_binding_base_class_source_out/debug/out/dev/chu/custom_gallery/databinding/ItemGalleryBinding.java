// Generated by data binding compiler. Do not edit!
package dev.chu.custom_gallery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.entity.MediaItem;
import dev.chu.custom_gallery.entity.Selection;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemGalleryBinding extends ViewDataBinding {
  @NonNull
  public final ImageView checked;

  @NonNull
  public final View dim;

  @NonNull
  public final ImageView image;

  @Bindable
  protected MediaItem mItem;

  @Bindable
  protected Selection mSelection;

  @Bindable
  protected Integer mPosition;

  protected ItemGalleryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView checked, View dim, ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checked = checked;
    this.dim = dim;
    this.image = image;
  }

  public abstract void setItem(@Nullable MediaItem item);

  @Nullable
  public MediaItem getItem() {
    return mItem;
  }

  public abstract void setSelection(@Nullable Selection selection);

  @Nullable
  public Selection getSelection() {
    return mSelection;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  @NonNull
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemGalleryBinding>inflateInternal(inflater, R.layout.item_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemGalleryBinding>inflateInternal(inflater, R.layout.item_gallery, null, false, component);
  }

  public static ItemGalleryBinding bind(@NonNull View view) {
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
  public static ItemGalleryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemGalleryBinding)bind(component, view, R.layout.item_gallery);
  }
}
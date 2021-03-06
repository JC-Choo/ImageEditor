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
import dev.chu.custom_gallery.entity.AlbumItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFolderBinding extends ViewDataBinding {
  @NonNull
  public final TextView count;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView name;

  @NonNull
  public final ImageView select;

  @Bindable
  protected AlbumItem mItem;

  protected ItemFolderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView count, ImageView image, TextView name, ImageView select) {
    super(_bindingComponent, _root, _localFieldCount);
    this.count = count;
    this.image = image;
    this.name = name;
    this.select = select;
  }

  public abstract void setItem(@Nullable AlbumItem item);

  @Nullable
  public AlbumItem getItem() {
    return mItem;
  }

  @NonNull
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_folder, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFolderBinding>inflateInternal(inflater, R.layout.item_folder, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_folder, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFolderBinding>inflateInternal(inflater, R.layout.item_folder, null, false, component);
  }

  public static ItemFolderBinding bind(@NonNull View view) {
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
  public static ItemFolderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFolderBinding)bind(component, view, R.layout.item_folder);
  }
}

// Generated by data binding compiler. Do not edit!
package dev.chu.custom_gallery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.ui.ToolbarViewModel;
import dev.chu.custom_gallery.ui.folder.FolderViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFolderBinding extends ViewDataBinding {
  @NonNull
  public final IncludeToolbarBinding includeToolbar;

  @NonNull
  public final RecyclerView list;

  @Bindable
  protected FolderViewModel mViewModel;

  @Bindable
  protected ToolbarViewModel mToolbarVM;

  protected FragmentFolderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      IncludeToolbarBinding includeToolbar, RecyclerView list) {
    super(_bindingComponent, _root, _localFieldCount);
    this.includeToolbar = includeToolbar;
    this.list = list;
  }

  public abstract void setViewModel(@Nullable FolderViewModel viewModel);

  @Nullable
  public FolderViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setToolbarVM(@Nullable ToolbarViewModel toolbarVM);

  @Nullable
  public ToolbarViewModel getToolbarVM() {
    return mToolbarVM;
  }

  @NonNull
  public static FragmentFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_folder, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFolderBinding>inflateInternal(inflater, R.layout.fragment_folder, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFolderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_folder, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFolderBinding>inflateInternal(inflater, R.layout.fragment_folder, null, false, component);
  }

  public static FragmentFolderBinding bind(@NonNull View view) {
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
  public static FragmentFolderBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFolderBinding)bind(component, view, R.layout.fragment_folder);
  }
}
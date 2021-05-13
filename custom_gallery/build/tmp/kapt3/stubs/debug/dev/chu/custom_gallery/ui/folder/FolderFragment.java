package dev.chu.custom_gallery.ui.folder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0012\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00101\u001a\u00020\'H\u0016J\u001a\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00104\u001a\u00020\'H\u0002J\b\u00105\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00066"}, d2 = {"Ldev/chu/custom_gallery/ui/folder/FolderFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "_binding", "Ldev/chu/custom_gallery/databinding/FragmentFolderBinding;", "adapter", "Ldev/chu/custom_gallery/ui/folder/FolderAdapter;", "binding", "getBinding", "()Ldev/chu/custom_gallery/databinding/FragmentFolderBinding;", "sharedVM", "Ldev/chu/custom_gallery/ui/GallerySharedViewModel;", "sharedViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getSharedViewModelProvider$annotations", "getSharedViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "setSharedViewModelProvider", "(Landroidx/lifecycle/ViewModelProvider;)V", "toolbarVM", "Ldev/chu/custom_gallery/ui/ToolbarViewModel;", "getToolbarVM", "()Ldev/chu/custom_gallery/ui/ToolbarViewModel;", "setToolbarVM", "(Ldev/chu/custom_gallery/ui/ToolbarViewModel;)V", "viewModel", "Ldev/chu/custom_gallery/ui/folder/FolderViewModel;", "getViewModel$annotations", "getViewModel", "()Ldev/chu/custom_gallery/ui/folder/FolderViewModel;", "setViewModel", "(Ldev/chu/custom_gallery/ui/folder/FolderViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "observeViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "setRecyclerView", "setToolbar", "custom_gallery_debug"})
public final class FolderFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @javax.inject.Inject()
    public dev.chu.custom_gallery.ui.folder.FolderViewModel viewModel;
    @javax.inject.Inject()
    public dev.chu.custom_gallery.ui.ToolbarViewModel toolbarVM;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider sharedViewModelProvider;
    private dev.chu.custom_gallery.databinding.FragmentFolderBinding _binding;
    private dev.chu.custom_gallery.ui.GallerySharedViewModel sharedVM;
    private dev.chu.custom_gallery.ui.folder.FolderAdapter adapter;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @dev.chu.core.di.ViewModelInject()
    @java.lang.Deprecated()
    public static void getViewModel$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.ui.folder.FolderViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.folder.FolderViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.chu.custom_gallery.ui.ToolbarViewModel getToolbarVM() {
        return null;
    }
    
    public final void setToolbarVM(@org.jetbrains.annotations.NotNull()
    dev.chu.custom_gallery.ui.ToolbarViewModel p0) {
    }
    
    @dev.chu.core.di.SharedViewModelProvider()
    @java.lang.Deprecated()
    public static void getSharedViewModelProvider$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider getSharedViewModelProvider() {
        return null;
    }
    
    public final void setSharedViewModelProvider(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider p0) {
    }
    
    private final dev.chu.custom_gallery.databinding.FragmentFolderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setToolbar() {
    }
    
    private final void observeViewModel() {
    }
    
    public FolderFragment() {
        super();
    }
}
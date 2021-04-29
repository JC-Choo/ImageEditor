package dev.chu.custom_gallery.databinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFolderBindingImpl extends FragmentFolderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0, 
            new String[] {"include_toolbar"},
            new int[] {1},
            new int[] {dev.chu.custom_gallery.R.layout.include_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.list, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFolderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentFolderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (dev.chu.custom_gallery.databinding.IncludeToolbarBinding) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        setContainedBinding(this.includeToolbar);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        includeToolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeToolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((dev.chu.custom_gallery.ui.folder.FolderViewModel) variable);
        }
        else if (BR.toolbarVM == variableId) {
            setToolbarVM((dev.chu.custom_gallery.ui.ToolbarViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable dev.chu.custom_gallery.ui.folder.FolderViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setToolbarVM(@Nullable dev.chu.custom_gallery.ui.ToolbarViewModel ToolbarVM) {
        updateRegistration(1, ToolbarVM);
        this.mToolbarVM = ToolbarVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.toolbarVM);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeToolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeToolbar((dev.chu.custom_gallery.databinding.IncludeToolbarBinding) object, fieldId);
            case 1 :
                return onChangeToolbarVM((dev.chu.custom_gallery.ui.ToolbarViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeToolbar(dev.chu.custom_gallery.databinding.IncludeToolbarBinding IncludeToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbarVM(dev.chu.custom_gallery.ui.ToolbarViewModel ToolbarVM, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        dev.chu.custom_gallery.ui.ToolbarViewModel toolbarVM = mToolbarVM;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.includeToolbar.setToolbarVM(toolbarVM);
        }
        executeBindingsOn(includeToolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeToolbar
        flag 1 (0x2L): toolbarVM
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
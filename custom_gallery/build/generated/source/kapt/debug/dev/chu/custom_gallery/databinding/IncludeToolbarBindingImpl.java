package dev.chu.custom_gallery.databinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeToolbarBindingImpl extends IncludeToolbarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeToolbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private IncludeToolbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.complete.setTag(null);
        this.leftImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.toolbarVM == variableId) {
            setToolbarVM((dev.chu.custom_gallery.ui.ToolbarViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setToolbarVM(@Nullable dev.chu.custom_gallery.ui.ToolbarViewModel ToolbarVM) {
        updateRegistration(0, ToolbarVM);
        this.mToolbarVM = ToolbarVM;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.toolbarVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeToolbarVM((dev.chu.custom_gallery.ui.ToolbarViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeToolbarVM(dev.chu.custom_gallery.ui.ToolbarViewModel ToolbarVM, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.backgroundColor) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.leftImageDrawable) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.onClickLeft) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.titleColor) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.onClickTitle) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.titleDrawableRight) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.rightImageDrawable) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.onClickRight) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.rightVisible) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        int toolbarVMLeftImageDrawable = 0;
        android.view.View.OnClickListener toolbarVMOnClickTitle = null;
        android.view.View.OnClickListener toolbarVMOnClickLeft = null;
        boolean toolbarVMRightVisible = false;
        int toolbarVMRightImageDrawable = 0;
        int toolbarVMBackgroundColor = 0;
        int toolbarVMTitleColor = 0;
        java.lang.String toolbarVMTitle = null;
        java.lang.Integer toolbarVMTitleDrawableRight = null;
        android.view.View.OnClickListener toolbarVMOnClickRight = null;
        int androidxDatabindingViewDataBindingSafeUnboxToolbarVMTitleDrawableRight = 0;
        dev.chu.custom_gallery.ui.ToolbarViewModel toolbarVM = mToolbarVM;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0x805L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.leftImageDrawable
                        toolbarVMLeftImageDrawable = toolbarVM.getLeftImageDrawable();
                    }
            }
            if ((dirtyFlags & 0x841L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.onClickTitle
                        toolbarVMOnClickTitle = toolbarVM.getOnClickTitle();
                    }
            }
            if ((dirtyFlags & 0x809L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.onClickLeft
                        toolbarVMOnClickLeft = toolbarVM.getOnClickLeft();
                    }
            }
            if ((dirtyFlags & 0xc01L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.rightVisible
                        toolbarVMRightVisible = toolbarVM.isRightVisible();
                    }
            }
            if ((dirtyFlags & 0x901L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.rightImageDrawable
                        toolbarVMRightImageDrawable = toolbarVM.getRightImageDrawable();
                    }
            }
            if ((dirtyFlags & 0x803L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.backgroundColor
                        toolbarVMBackgroundColor = toolbarVM.getBackgroundColor();
                    }
            }
            if ((dirtyFlags & 0x821L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.titleColor
                        toolbarVMTitleColor = toolbarVM.getTitleColor();
                    }
            }
            if ((dirtyFlags & 0x811L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.title
                        toolbarVMTitle = toolbarVM.getTitle();
                    }
            }
            if ((dirtyFlags & 0x881L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.titleDrawableRight
                        toolbarVMTitleDrawableRight = toolbarVM.getTitleDrawableRight();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(toolbarVM.titleDrawableRight)
                    androidxDatabindingViewDataBindingSafeUnboxToolbarVMTitleDrawableRight = androidx.databinding.ViewDataBinding.safeUnbox(toolbarVMTitleDrawableRight);
            }
            if ((dirtyFlags & 0xa01L) != 0) {

                    if (toolbarVM != null) {
                        // read toolbarVM.onClickRight
                        toolbarVMOnClickRight = toolbarVM.getOnClickRight();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x901L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.setImageDrawable(this.complete, toolbarVMRightImageDrawable);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.onClickEvent(this.complete, toolbarVMOnClickRight);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.setVisible(this.complete, toolbarVMRightVisible);
        }
        if ((dirtyFlags & 0x805L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.setImageDrawable(this.leftImage, toolbarVMLeftImageDrawable);
        }
        if ((dirtyFlags & 0x809L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.onClickEvent(this.leftImage, toolbarVMOnClickLeft);
        }
        if ((dirtyFlags & 0x803L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, androidx.databinding.adapters.Converters.convertColorToDrawable(toolbarVMBackgroundColor));
        }
        if ((dirtyFlags & 0x811L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, toolbarVMTitle);
        }
        if ((dirtyFlags & 0x821L) != 0) {
            // api target 1

            this.title.setTextColor(toolbarVMTitleColor);
        }
        if ((dirtyFlags & 0x841L) != 0) {
            // api target 1

            dev.chu.core.util.BindingAdapterKt.onClickEvent(this.title, toolbarVMOnClickTitle);
        }
        if ((dirtyFlags & 0x881L) != 0) {
            // api target 1

            dev.chu.custom_gallery.util.BindingAdapterKt.setTitleDrawableRight(this.title, androidxDatabindingViewDataBindingSafeUnboxToolbarVMTitleDrawableRight);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): toolbarVM
        flag 1 (0x2L): toolbarVM.backgroundColor
        flag 2 (0x3L): toolbarVM.leftImageDrawable
        flag 3 (0x4L): toolbarVM.onClickLeft
        flag 4 (0x5L): toolbarVM.title
        flag 5 (0x6L): toolbarVM.titleColor
        flag 6 (0x7L): toolbarVM.onClickTitle
        flag 7 (0x8L): toolbarVM.titleDrawableRight
        flag 8 (0x9L): toolbarVM.rightImageDrawable
        flag 9 (0xaL): toolbarVM.onClickRight
        flag 10 (0xbL): toolbarVM.rightVisible
        flag 11 (0xcL): null
    flag mapping end*/
    //end
}
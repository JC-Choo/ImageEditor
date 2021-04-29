package dev.chu.custom_gallery.databinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemGalleryBindingImpl extends ItemGalleryBinding implements dev.chu.custom_gallery.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGalleryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemGalleryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.checked.setTag(null);
        this.dim.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new dev.chu.custom_gallery.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.item == variableId) {
            setItem((dev.chu.custom_gallery.entity.MediaItem) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.selection == variableId) {
            setSelection((dev.chu.custom_gallery.entity.Selection) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable dev.chu.custom_gallery.entity.MediaItem Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
    }
    public void setSelection(@Nullable dev.chu.custom_gallery.entity.Selection Selection) {
        this.mSelection = Selection;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.selection);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((dev.chu.custom_gallery.entity.MediaItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(dev.chu.custom_gallery.entity.MediaItem Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        dev.chu.custom_gallery.entity.MediaItem item = mItem;
        boolean selectionIsSelectedItemId = false;
        long itemId = 0;
        dev.chu.custom_gallery.entity.Selection selection = mSelection;
        android.graphics.drawable.Drawable selectionIsSelectedItemIdCheckedAndroidDrawableCheckOnCheckedAndroidDrawableCheckOff = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (item != null) {
                    // read item.id
                    itemId = item.getId();
                }


                if (selection != null) {
                    // read selection.isSelected(item.id)
                    selectionIsSelectedItemId = selection.isSelected(itemId);
                }
            if((dirtyFlags & 0xdL) != 0) {
                if(selectionIsSelectedItemId) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read selection.isSelected(item.id) ? @android:drawable/check_on : @android:drawable/check_off
                selectionIsSelectedItemIdCheckedAndroidDrawableCheckOnCheckedAndroidDrawableCheckOff = ((selectionIsSelectedItemId) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(checked.getContext(), R.drawable.check_on)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(checked.getContext(), R.drawable.check_off)));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.checked, selectionIsSelectedItemIdCheckedAndroidDrawableCheckOnCheckedAndroidDrawableCheckOff);
            dev.chu.core.util.BindingAdapterKt.setVisible(this.dim, selectionIsSelectedItemId);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.image.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        dev.chu.custom_gallery.entity.MediaItem item = mItem;
        // item.listener
        dev.chu.custom_gallery.entity.MediaItem.OnItemClickListener itemListener = null;
        // item.listener != null
        boolean itemListenerJavaLangObjectNull = false;
        // item != null
        boolean itemJavaLangObjectNull = false;



        itemJavaLangObjectNull = (item) != (null);
        if (itemJavaLangObjectNull) {


            itemListener = item.getListener();

            itemListenerJavaLangObjectNull = (itemListener) != (null);
            if (itemListenerJavaLangObjectNull) {



                itemListener.onItemClick(item);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): position
        flag 2 (0x3L): selection
        flag 3 (0x4L): null
        flag 4 (0x5L): selection.isSelected(item.id) ? @android:drawable/check_on : @android:drawable/check_off
        flag 5 (0x6L): selection.isSelected(item.id) ? @android:drawable/check_on : @android:drawable/check_off
    flag mapping end*/
    //end
}
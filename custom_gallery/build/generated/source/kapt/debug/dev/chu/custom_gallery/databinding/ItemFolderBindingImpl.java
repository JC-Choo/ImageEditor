package dev.chu.custom_gallery.databinding;
import dev.chu.custom_gallery.R;
import dev.chu.custom_gallery.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFolderBindingImpl extends ItemFolderBinding implements dev.chu.custom_gallery.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.select, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFolderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemFolderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            );
        this.count.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new dev.chu.custom_gallery.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setItem((dev.chu.custom_gallery.entity.AlbumItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable dev.chu.custom_gallery.entity.AlbumItem Item) {
        updateRegistration(0, Item);
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((dev.chu.custom_gallery.entity.AlbumItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(dev.chu.custom_gallery.entity.AlbumItem Item, int fieldId) {
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
        android.net.Uri itemRecentMediaUri = null;
        dev.chu.custom_gallery.entity.AlbumItem item = mItem;
        java.lang.String stringValueOfItemAlbumCount = null;
        java.lang.String itemAlbumName = null;
        dev.chu.custom_gallery.entity.Album itemAlbum = null;
        int itemAlbumCount = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.recentMediaUri
                    itemRecentMediaUri = item.getRecentMediaUri();
                    // read item.album
                    itemAlbum = item.getAlbum();
                }


                if (itemAlbum != null) {
                    // read item.album.name
                    itemAlbumName = itemAlbum.getName();
                    // read item.album.count
                    itemAlbumCount = itemAlbum.getCount();
                }


                // read String.valueOf(item.album.count)
                stringValueOfItemAlbumCount = java.lang.String.valueOf(itemAlbumCount);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.count, stringValueOfItemAlbumCount);
            dev.chu.core.util.BindingAdapterKt.setImageDrawable(this.image, itemRecentMediaUri);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, itemAlbumName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        dev.chu.custom_gallery.entity.AlbumItem item = mItem;
        // item.listener
        dev.chu.custom_gallery.entity.AlbumItem.OnItemClickListener itemListener = null;
        // item.listener != null
        boolean itemListenerJavaLangObjectNull = false;
        // item != null
        boolean itemJavaLangObjectNull = false;



        itemJavaLangObjectNull = (item) != (null);
        if (itemJavaLangObjectNull) {


            itemListener = item.getListener();

            itemListenerJavaLangObjectNull = (itemListener) != (null);
            if (itemListenerJavaLangObjectNull) {



                itemListener.onClickFolder(item);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
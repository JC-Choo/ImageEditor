package dev.chu.custom_gallery;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import dev.chu.custom_gallery.databinding.ActivityGalleryBindingImpl;
import dev.chu.custom_gallery.databinding.FragmentFolderBindingImpl;
import dev.chu.custom_gallery.databinding.FragmentMainBindingImpl;
import dev.chu.custom_gallery.databinding.IncludeToolbarBindingImpl;
import dev.chu.custom_gallery.databinding.ItemFolderBindingImpl;
import dev.chu.custom_gallery.databinding.ItemGalleryBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYGALLERY = 1;

  private static final int LAYOUT_FRAGMENTFOLDER = 2;

  private static final int LAYOUT_FRAGMENTMAIN = 3;

  private static final int LAYOUT_INCLUDETOOLBAR = 4;

  private static final int LAYOUT_ITEMFOLDER = 5;

  private static final int LAYOUT_ITEMGALLERY = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.activity_gallery, LAYOUT_ACTIVITYGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.fragment_folder, LAYOUT_FRAGMENTFOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.include_toolbar, LAYOUT_INCLUDETOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.item_folder, LAYOUT_ITEMFOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(dev.chu.custom_gallery.R.layout.item_gallery, LAYOUT_ITEMGALLERY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYGALLERY: {
          if ("layout/activity_gallery_0".equals(tag)) {
            return new ActivityGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOLDER: {
          if ("layout/fragment_folder_0".equals(tag)) {
            return new FragmentFolderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_folder is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDETOOLBAR: {
          if ("layout/include_toolbar_0".equals(tag)) {
            return new IncludeToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFOLDER: {
          if ("layout/item_folder_0".equals(tag)) {
            return new ItemFolderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_folder is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGALLERY: {
          if ("layout/item_gallery_0".equals(tag)) {
            return new ItemGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_gallery is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new dev.chu.core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(16);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "backgroundColor");
      sKeys.put(2, "item");
      sKeys.put(3, "leftImageDrawable");
      sKeys.put(4, "onClickLeft");
      sKeys.put(5, "onClickRight");
      sKeys.put(6, "onClickTitle");
      sKeys.put(7, "position");
      sKeys.put(8, "rightImageDrawable");
      sKeys.put(9, "rightVisible");
      sKeys.put(10, "selection");
      sKeys.put(11, "title");
      sKeys.put(12, "titleColor");
      sKeys.put(13, "titleDrawableRight");
      sKeys.put(14, "toolbarVM");
      sKeys.put(15, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_gallery_0", dev.chu.custom_gallery.R.layout.activity_gallery);
      sKeys.put("layout/fragment_folder_0", dev.chu.custom_gallery.R.layout.fragment_folder);
      sKeys.put("layout/fragment_main_0", dev.chu.custom_gallery.R.layout.fragment_main);
      sKeys.put("layout/include_toolbar_0", dev.chu.custom_gallery.R.layout.include_toolbar);
      sKeys.put("layout/item_folder_0", dev.chu.custom_gallery.R.layout.item_folder);
      sKeys.put("layout/item_gallery_0", dev.chu.custom_gallery.R.layout.item_gallery);
    }
  }
}

package dev.chu.custom_gallery.ui.main

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import dev.chu.custom_gallery.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun actionMainToFolder(): NavDirections =
        ActionOnlyNavDirections(R.id.action_main_to_folder)
  }
}

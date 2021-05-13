package dev.chu.custom_gallery.ui

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.android.support.DaggerAppCompatActivity
import dev.chu.core.util.ext.TAG
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.databinding.ActivityGalleryBinding

class GalleryActivity : DaggerAppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
//        navController.setGraph(R.navigation.nav_gallery)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            val dest = try {
                resources.getResourceName(destination.id)
            } catch (e: Resources.NotFoundException) {
                destination.id.toString()
            }
            Log.d(TAG, "Navigated to $dest")
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
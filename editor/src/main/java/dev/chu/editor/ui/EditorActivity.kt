package dev.chu.editor.ui

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.android.support.DaggerAppCompatActivity
import dev.chu.core.util.ext.TAG
import dev.chu.custom_gallery.entity.Media
import dev.chu.custom_gallery.etc.Const
import dev.chu.editor.R

class EditorActivity : DaggerAppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        val media = intent.getParcelableExtra<Media>(Const.MEDIA)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        navController.setGraph(R.navigation.nav_editor, bundleOf(Const.MEDIA to media))
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
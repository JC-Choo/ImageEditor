package dev.chu.imageeditor

import android.Manifest
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import dev.chu.core.util.ext.TAG
import dev.chu.core.util.ext.click
import dev.chu.core.util.ext.hasPermissions
import dev.chu.core.util.ext.toast
import dev.chu.imageeditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private val permissions = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    }

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

//    private val adapter by lazy {
//        MainAdapter { media ->
//            startActivity(Intent(this, EditorActivity::class.java).apply {
//                putExtra(Const.MEDIA, media)
//            })
//        }
//    }

    private val requestPermission =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { map ->
            if (!map.values.any { !it }) {
//                startActivity(Intent(this@MainActivity, EditorActivity::class.java))
            }
        }

//    private val launcher = PermissionCheck.register(this) { mediaList ->
//        adapter.setNewItems(mediaList)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this

//        binding.list.adapter = adapter

        binding.gallery.click {
//            launcher.launch()
        }
    }
}
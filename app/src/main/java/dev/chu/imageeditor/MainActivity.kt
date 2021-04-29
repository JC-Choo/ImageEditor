package dev.chu.imageeditor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dev.chu.core.util.ext.click
import dev.chu.custom_gallery.ui.main.MainAdapter
import dev.chu.custom_gallery.util.permission.PermissionCheck
import dev.chu.imageeditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
    private val adapter by lazy {
        MainAdapter { media ->
//            startActivity(Intent(this, EditorActivity::class.java).apply {
//                putExtra(Const.MEDIA, media)
//            })
        }
    }

    private val launcher = PermissionCheck.register(this) { mediaList ->
        adapter.setNewItems(mediaList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this

        binding.list.adapter = adapter

        binding.gallery.click {
            launcher.launch()
        }
    }
}
package dev.chu.imageeditor

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import dev.chu.core.util.ext.click
import dev.chu.core.util.ext.setImageLoad
import dev.chu.custom_gallery.etc.Const
import dev.chu.custom_gallery.ui.main.MainAdapter
import dev.chu.custom_gallery.util.permission.PermissionCheck
import dev.chu.imageeditor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private val requestActivity: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { activityResult ->
        if (activityResult.resultCode == RESULT_OK) {
            binding.image.isVisible = true
            val byteArr = activityResult.data?.getByteArrayExtra(Const.IMAGE_BYTE_ARRAY) ?: return@registerForActivityResult
            binding.image.setImageLoad(byteArray = byteArr)
        }
    }

    private val adapter by lazy {
        MainAdapter { media ->
//            requestActivity.launch(Intent(this, EditorActivity::class.java).apply {
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
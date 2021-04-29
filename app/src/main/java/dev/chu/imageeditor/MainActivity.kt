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

    private val adapter by lazy {
        MainAdapter { media ->
            startActivity(Intent(this, EditorActivity::class.java).apply {
                putExtra(Const.MEDIA, media)
            })
        }
    }

    private val requestPermission =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { map ->
            if (!map.values.any { !it }) {
                startActivity(Intent(this@MainActivity, EditorActivity::class.java))
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

    private fun checkPermission(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (hasPermissions(*permissions)) {
//                startActivity(Intent(this@MainActivity, EditorActivity::class.java))
                toast("권한 성공")
            } else {
                for (permission in permissions) {
                    Log.i(TAG, "permission = $permission")
                    when {
                        shouldShowRequestPermissionRationale(permission) -> {
                            Log.i(TAG, "shouldShowRequestPermissionRationale ")
                            AlertDialog.Builder(this)
                                .setTitle("권한")
                                .setMessage("권한을 허용해야 사용 가능합니다. 이 기능을 사용하시겠습니까?")
                                .setPositiveButton("확인") { _, _ ->
                                    requestPermission.launch(permissions)
                                }
                                .setNegativeButton("취소") { _, _ ->

                                }
                                .show()
                            break
                        }
                        else -> {
                            Log.i(TAG, "else ")
                            /**
                             * 최초 진입 시, 다시 보지 않기 클릭 시 -> else 를 탄다.
                             * 즉, 최초 진입 시에는 requestPermissions.launch() 를,
                             * 다시 보지 않기 클릭 시에는 showDialogToGetPermission() 을 호출한다.
                             *
                             * 최초 진입 시를 확인하기 위해, binding.permission 처음 클릭 시 shared 에 저장한다?
                             * 최초 유무를 확인할 수 있는 다른 방법이 있나...?
                             */
                            requestPermission.launch(permissions)
                        }
                    }
                }
            }
        }
        return false
    }
}
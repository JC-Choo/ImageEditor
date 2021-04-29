package dev.chu.custom_gallery.util.permission

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.entity.Media

class PermissionCheck {

    private lateinit var launcher: ActivityResultLauncher<Unit>
    private lateinit var requestPermissionLauncher: ActivityResultLauncher<String>

    companion object {
        private const val PERMISSION = Manifest.permission.READ_EXTERNAL_STORAGE

        @JvmStatic
        private fun register(
            activity: ComponentActivity,
            successCallback: (ArrayList<Media>) -> Unit,
            failCallback: () -> Unit
        ): PermissionCheck {
            val permissionCheck = PermissionCheck()
            permissionCheck.launcher =
                activity.registerForActivityResult(PermissionActivityContract()) {
                    successCallback.invoke(it)
                }
            permissionCheck.requestPermissionLauncher =
                activity.registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
                    if (isGranted) {
                        permissionCheck.internalLaunch()
                    } else {
                        failCallback.invoke()
                    }
                }
            return permissionCheck
        }

        @JvmStatic
        fun register(
            activity: ComponentActivity,
            successCallback: (ArrayList<Media>) -> Unit
        ) = register(activity, successCallback) {
            showDialogToGetPermissionFromSystemSetting(activity)
        }

        private fun showDialogToGetPermissionFromSystemSetting(activity: Activity) {
            AlertDialog.Builder(activity)
                .setTitle(R.string.permission)
                .setMessage(R.string.permission_msg)
                .setPositiveButton(R.string.ok) { _, _ ->
                    Intent().also {
                        it.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                        it.data = Uri.fromParts("package", activity.packageName, null)
                        it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        activity.startActivity(it)
                    }
                }
                .setNegativeButton(R.string.cancel) { _, _ ->

                }
                .show()
        }
    }

    private fun internalLaunch() {
        launcher.launch(Unit)
    }

    fun launch() {
        requestPermissionLauncher.launch(PERMISSION)
    }
}
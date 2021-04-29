package dev.chu.custom_gallery.util.permission

import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import dev.chu.custom_gallery.ui.GalleryActivity
import dev.chu.custom_gallery.entity.Media
import dev.chu.custom_gallery.etc.Const

class PermissionActivityContract: ActivityResultContract<Unit, ArrayList<Media>>() {
    override fun createIntent(context: Context, input: Unit?): Intent {
        return Intent(context, GalleryActivity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): ArrayList<Media> {
        return intent?.getParcelableArrayListExtra(Const.MEDIA_LIST) ?: ArrayList()
    }
}
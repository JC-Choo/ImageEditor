package dev.chu.editor.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dagger.android.support.DaggerAppCompatActivity
import dev.chu.editor.R
import dev.chu.editor.databinding.ActivityEditorBinding

class EditorActivity : DaggerAppCompatActivity() {

    private val binding: ActivityEditorBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_editor)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
    }
}
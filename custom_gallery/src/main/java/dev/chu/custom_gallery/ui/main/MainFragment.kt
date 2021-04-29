package dev.chu.custom_gallery.ui.main

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import dev.chu.core.di.SharedViewModelProvider
import dev.chu.core.di.ViewModelInject
import dev.chu.core.util.ext.navigate
import dev.chu.core.util.ext.toast
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.databinding.FragmentMainBinding
import dev.chu.custom_gallery.etc.Const
import dev.chu.custom_gallery.ui.GallerySharedViewModel
import dev.chu.custom_gallery.ui.ToolbarViewModel
import javax.inject.Inject

class MainFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @ViewModelInject
    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    @SharedViewModelProvider
    lateinit var sharedViewModelProvider: ViewModelProvider

    @Inject
    lateinit var toolbarVM: ToolbarViewModel

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    private var sharedVM: GallerySharedViewModel? = null
    private lateinit var adapter: MainAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (sharedVM == null)
            sharedVM = sharedViewModelProvider[GallerySharedViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbarVM = toolbarVM

        setRecyclerView()
        setToolbar()
        observeViewModel()

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    onBackPressed()
                }
            })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        sharedVM = null
    }

    private fun setRecyclerView() {
        adapter = MainAdapter(viewModel)
        binding.list.adapter = adapter
        binding.list.setHasFixedSize(true)
    }

    private fun setToolbar() {
        toolbarVM.onClickLeft = View.OnClickListener { requireActivity().finish() }
        toolbarVM.onClickRight = View.OnClickListener {
            requireActivity().setResult(Activity.RESULT_OK, Intent().apply {
                putParcelableArrayListExtra(Const.MEDIA_LIST, ArrayList(viewModel.getSelectedMediaList()))
            })
            requireActivity().finish()
        }
        toolbarVM.onClickTitle = View.OnClickListener { goToFolder() }
    }

    private fun observeViewModel() {
        sharedVM?.album?.observe(viewLifecycleOwner) {
            viewModel.setBucketId(it)
        }

        viewModel.itemsOfAlbum.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        viewModel.selection.isUpThreeSelectedItem.observe(viewLifecycleOwner) {
            if (it == true) {
                requireContext().toast(R.string.msg_item_count_3)
            }
        }

        viewModel.selection.getCount().observe(viewLifecycleOwner) { count ->
            toolbarVM.isRightVisible = count != 0
        }

        viewModel.currentAlbum.observe(viewLifecycleOwner) { album ->
            toolbarVM.title = album?.name ?: getString(R.string.all_picture)
        }
    }

    private fun goToFolder() {
        navigate(MainFragmentDirections.actionMainToFolder())
    }

    private fun onBackPressed() {
        if (viewModel.selection.toList().isNotEmpty()) {
            AlertDialog.Builder(requireContext())
                .setMessage(R.string.msg_selected_item)
                .setPositiveButton(R.string.ok) { _, _ ->
                    requireActivity().finish()
                }
                .setNegativeButton(R.string.cancel) { _, _ ->

                }
                .show()
        } else {
            requireActivity().finish()
        }
    }
}
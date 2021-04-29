package dev.chu.custom_gallery.ui.folder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerFragment
import dev.chu.core.di.SharedViewModelProvider
import dev.chu.core.di.ViewModelInject
import dev.chu.core.util.ext.backStack
import dev.chu.custom_gallery.R
import dev.chu.custom_gallery.databinding.FragmentFolderBinding
import dev.chu.custom_gallery.ui.GallerySharedViewModel
import dev.chu.custom_gallery.ui.ToolbarViewModel
import javax.inject.Inject

class FolderFragment: DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @ViewModelInject
    @Inject
    lateinit var viewModel: FolderViewModel

    @Inject
    lateinit var toolbarVM: ToolbarViewModel

    @Inject
    @SharedViewModelProvider
    lateinit var sharedViewModelProvider: ViewModelProvider

    private var _binding: FragmentFolderBinding? = null
    private val binding: FragmentFolderBinding get() = _binding!!

    private lateinit var sharedVM: GallerySharedViewModel
    private lateinit var adapter: FolderAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_folder, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedVM = sharedViewModelProvider[GallerySharedViewModel::class.java]
        binding.viewModel = viewModel
        binding.toolbarVM = toolbarVM

        setRecyclerView()
        setToolbar()
        observeViewModel()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setRecyclerView() {
        adapter = FolderAdapter()

        binding.list.addItemDecoration(DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL))
        binding.list.adapter = adapter
        binding.list.setHasFixedSize(true)
    }

    private fun setToolbar() {
        toolbarVM.onClickLeft = View.OnClickListener { backStack() }
        toolbarVM.onClickTitle = View.OnClickListener { backStack() }
    }

    private fun observeViewModel() {
        viewModel.items.observe(viewLifecycleOwner) { items ->
            adapter.setNewItems(items)
        }

        viewModel.itemClickEvent.observe(viewLifecycleOwner) { item ->
            sharedVM.setBucketId(item?.album)
            findNavController().navigateUp()
        }
    }
}
package dev.chu.editor.ui.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.android.support.DaggerFragment
import dev.chu.editor.R
import dev.chu.editor.databinding.FragmentMainBinding
import dev.chu.editor.ui.main.data.EditTypeItem

class MainFragment: DaggerFragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    private val adapter by lazy {
        MainAdapter()
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

        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    requireActivity().finish()
                }
            })

        binding.list.layoutManager = LinearLayoutManager(
            requireContext(),
            RecyclerView.HORIZONTAL,
            false
        )
        binding.list.adapter = adapter
        adapter.setNewItems(getEditTypeList())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getEditTypeList(): ArrayList<EditTypeItem> {
        val list = ArrayList<EditTypeItem>()
        list.add(EditTypeItem(R.drawable.arrow_back_000000, getString(R.string.brightness)))
        list.add(EditTypeItem(R.drawable.arrow_back_000000, getString(R.string.crop)))
        list.add(EditTypeItem(R.drawable.arrow_back_000000, getString(R.string.rotation)))
        resources.getStringArray(R.array.rotation_type).forEach {
            list.add(EditTypeItem(R.drawable.arrow_back_000000, it))
        }

        return list
    }
}
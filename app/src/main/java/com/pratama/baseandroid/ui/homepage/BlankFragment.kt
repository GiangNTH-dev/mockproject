package com.pratama.baseandroid.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentBlankBinding

class BlankFragment : BaseFragmentBinding<FragmentBlankBinding>() {
    lateinit var viewModel:BlankViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vm by viewModels<BlankViewModel>()
        viewModel = vm
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBlankBinding =
    FragmentBlankBinding::inflate

    override fun setupView(binding: FragmentBlankBinding) {
        binding.txtTest.setOnClickListener {
            viewModel.clickText()
        }
        viewModel.text.observe(this) {
            binding.txtTest.text = it
        }
    }
}
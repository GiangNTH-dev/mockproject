package com.pratama.baseandroid.ui.homepage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentWellcomeBinding

class WellcomeFragment : BaseFragmentBinding<FragmentWellcomeBinding>() {

    companion object {
        fun newInstance() = WellcomeFragment()
    }

    private lateinit var viewModel: WellcomeViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_wellcomefragment_to_loginfragment)
        }, 3000)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WellcomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentWellcomeBinding=FragmentWellcomeBinding::inflate

    override fun setupView(binding: FragmentWellcomeBinding) {

    }

}
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
import com.pratama.baseandroid.databinding.WellcomeFragmentBinding

class WellcomeFragment : BaseFragmentBinding<WellcomeFragmentBinding>() {
    var handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({findNavController().navigate(R.id.action_wellcomehomepage_to_loginpage)},4000)
    }

    override fun onStop() {
        super.onStop()
    }

    private lateinit var viewModel: WellcomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> WellcomeFragmentBinding=WellcomeFragmentBinding::inflate

    override fun setupView(binding: WellcomeFragmentBinding) {

    }

}
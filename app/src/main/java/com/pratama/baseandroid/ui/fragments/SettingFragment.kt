package com.pratama.baseandroid.ui.fragments


import android.view.LayoutInflater
import android.view.ViewGroup
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentSettingBinding


class SettingFragment : BaseFragmentBinding<FragmentSettingBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingBinding=FragmentSettingBinding::inflate

    override fun setupView(binding: FragmentSettingBinding) {

    }

}
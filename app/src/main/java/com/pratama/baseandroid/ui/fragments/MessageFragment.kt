package com.pratama.baseandroid.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentMessageBinding

class MessageFragment : BaseFragmentBinding<FragmentMessageBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMessageBinding=FragmentMessageBinding::inflate

    override fun setupView(binding: FragmentMessageBinding) {

    }

}
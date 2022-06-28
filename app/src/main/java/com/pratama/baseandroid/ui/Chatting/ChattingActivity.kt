package com.pratama.baseandroid.ui.Chatting

import android.view.LayoutInflater
import com.pratama.baseandroid.coreandroid.base.BaseActivityBinding
import com.pratama.baseandroid.databinding.ActivityChattingBinding

class ChattingActivity : BaseActivityBinding<ActivityChattingBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityChattingBinding=ActivityChattingBinding::inflate

    override fun setupView(binding: ActivityChattingBinding) {
    }
}
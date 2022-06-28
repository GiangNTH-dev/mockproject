package com.pratama.baseandroid.ui.homepage


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentLoginBinding
import com.pratama.baseandroid.ui.Chatting.ChattingActivity

class LoginFragment : BaseFragmentBinding<FragmentLoginBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding=FragmentLoginBinding::inflate

    override fun setupView(binding: FragmentLoginBinding) {
        binding.loginFacebook.setOnClickListener(){
            Log.e("Err", "Login")
        val intent = Intent(this.context, ChattingActivity::class.java)
        startActivity(intent);
}
    }

}




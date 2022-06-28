package com.pratama.baseandroid.ui.homepage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentLoginBinding

class LoginFragment : BaseFragmentBinding<FragmentLoginBinding>() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding=FragmentLoginBinding::inflate

    override fun setupView(binding: FragmentLoginBinding) {
        binding.loginFacebook.setOnClickListener {
           findNavController().navigate(R.id.action_navigateto_chatting)
        }
        binding.loginTwitter.setOnClickListener {
            findNavController().navigate(R.id.action_navigateto_chatting)
        }
    }

}
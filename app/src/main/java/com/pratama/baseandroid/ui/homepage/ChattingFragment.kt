package com.pratama.baseandroid.ui.homepage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentChattingBinding
import com.pratama.baseandroid.ui.fragments.DrawerFragment
import com.pratama.baseandroid.ui.fragments.MapFragment
import com.pratama.baseandroid.ui.fragments.MessageFragment
import com.pratama.baseandroid.ui.fragments.SettingFragment

class ChattingFragment : BaseFragmentBinding<FragmentChattingBinding>() {
    private val drawerFragment=DrawerFragment()
    private val mapFragment=MapFragment()
    private val messageFragment=MessageFragment()
    private val settingFragment=SettingFragment()
    companion object {
        fun newInstance() = ChattingFragment()
    }

    private lateinit var viewModel: ChattingViewModel


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChattingViewModel::class.java)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(drawerFragment)

    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentChattingBinding=FragmentChattingBinding::inflate

    override fun setupView(binding: FragmentChattingBinding) {
        binding.bottomNavigationBar.setOnNavigationItemReselectedListener {
            when(it.itemId)
            {
                R.id.ic_drawer->replaceFragment(drawerFragment)
                R.id.ic_map->replaceFragment(mapFragment)
                R.id.ic_message->replaceFragment(messageFragment)
                R.id.ic_setting->replaceFragment(settingFragment)
            }
        }
    }
    private fun replaceFragment(fragment:Fragment)
    {
        if(fragment!=null)
        {

            val transaction=fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container,fragment)
            transaction?.commit()
        }
    }

}
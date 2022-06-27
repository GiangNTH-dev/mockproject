package com.pratama.baseandroid.ui.homepage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel() {
    fun clickText() {
        text.postValue(System.currentTimeMillis().toString())
    }

    val text:MutableLiveData<String>  = MutableLiveData()
}
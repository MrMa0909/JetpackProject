package com.cfox.viewmodedemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ShareViewModel : ViewModel() {
    val livedata = MutableLiveData(0)
    fun lifec() {
        viewModelScope.launch {

        }
    }
}
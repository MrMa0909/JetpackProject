package com.cfox.lifecyclektdemo

import android.util.Log
import androidx.lifecycle.*

class My2Observer : LifecycleEventObserver {
    companion object {
        private const val TAG = "MyObserver"
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {


    }

}
package com.cfox.lifecyclektdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * 监听应用退出后台
 */
class AppObserver : LifecycleObserver {
    companion object {
        private const val TAG = "AppObserver"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForeground() {
        Log.d(TAG, "onAppForeground: ....")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onAppBackground() {
        Log.d(TAG, "onAppBackground: .....")

    }

}
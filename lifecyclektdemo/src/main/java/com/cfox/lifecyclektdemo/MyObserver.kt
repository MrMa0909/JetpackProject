package com.cfox.lifecyclektdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * 使用注解方式添加生命周期方法，要注意是否需要是用lifecycle-compiler 提高效率
 * 如果使用 lifecycle-compiler 会在编译时创建MyObserver_LifecycleAdapter类，该类继承 GeneratedAdapter
 * 如果不使用 lifecycle-compiler 将使用反射的方法进行调用方法
 */
class MyObserver : LifecycleObserver {
    companion object {
        private const val TAG = "MyObserver"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d(TAG, "onCreate: .......")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.d(TAG, "onStart: ......")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.d(TAG, "onResume: ......")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.d(TAG, "onPause: ....")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d(TAG, "onStop: ......")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d(TAG, "onDestroy: ......")
    }
}
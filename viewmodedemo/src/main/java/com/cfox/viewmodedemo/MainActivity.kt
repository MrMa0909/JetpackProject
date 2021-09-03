package com.cfox.viewmodedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.cfox.viewmodedemo.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

//    val shareViewModel : ShareViewModel by viewModels()

    private lateinit var shareViewModel: ShareViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        shareViewModel = ViewModelProvider(this).get(ShareViewModel::class.java)

        Log.d(TAG, "onCreate: ")
        lifecycleScope.launchWhenStarted {
            Log.d(TAG, "launchWhenStarted: ")

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
        shareViewModel.livedata.observe(this, Observer {

        })

    }
}
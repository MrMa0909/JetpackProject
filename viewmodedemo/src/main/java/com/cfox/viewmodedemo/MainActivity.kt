package com.cfox.viewmodedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.cfox.viewmodedemo.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

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
    }
}
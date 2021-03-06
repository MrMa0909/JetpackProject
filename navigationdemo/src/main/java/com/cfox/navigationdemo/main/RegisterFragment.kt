package com.cfox.navigationdemo.main

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.cfox.navigationdemo.R

class RegisterFragment : Fragment(R.layout.fragment_register) {

    companion object {
        private const val TAG = "RegisterFragment"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
//            val navResult = findNavController().navigateUp() // 返回 ，true 成分 ， false 失败

            val navResult = findNavController().popBackStack()

            Log.d(TAG, "onViewCreated: back result:$navResult")
        }

        view.findViewById<Button>(R.id.btn_back_home).setOnClickListener {
            findNavController().navigate(R.id.action_global_fragment_main)
        }
        // 点击事件另一种写法
//        view.findViewById<Button>(R.id.btn_back_home)
//                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_global_fragment_main))

        view.findViewById<Button>(R.id.btn_back_nav).setOnClickListener {
            // 使用的action 必须是该页面可达的
//            findNavController().navigate(R.id.action_fragment_main_to_loginFragment)
            findNavController().navigate(R.id.action_register_fragment_to_login_fragment)
        }
    }
}
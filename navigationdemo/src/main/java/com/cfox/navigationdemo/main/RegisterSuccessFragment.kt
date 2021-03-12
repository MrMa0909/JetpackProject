package com.cfox.navigationdemo.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cfox.navigationdemo.R

class RegisterSuccessFragment : Fragment(R.layout.fragment_register_success) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // 点击事件另一种写法
//        view.findViewById<Button>(R.id.btn_back_home)
//                .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_global_fragment_main))

        view.findViewById<Button>(R.id.btn_back_nav).setOnClickListener {
            // 使用的action 必须是该页面可达的, 如果该fragment 中没有添加跳转的action ， 将会无法进行跳转
//            findNavController().navigate(R.id.action_fragment_main_to_loginFragment)
            findNavController().navigate(R.id.action_registerSuccessFragment_to_login_fragment)
        }

        view.findViewById<Button>(R.id.btn_back_home).setOnClickListener {
            findNavController().navigate(R.id.action_registerSuccessFragment_back_to_login_fragment)
        }


        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
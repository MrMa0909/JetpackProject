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
            // navigateUp 和 popBackStack 在正常使用时作用一样，fragment stack 中都会将将本身 pop stack
            val navResult = findNavController().navigateUp() // 返回 ，true 成功 ， false 失败

//            val navResult = findNavController().popBackStack()

            Log.d(TAG, "onViewCreated: back result:$navResult")
        }

        view.findViewById<Button>(R.id.btn_back_home).setOnClickListener {
            findNavController().navigate(R.id.action_global_fragment_main)
        }

        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            findNavController().navigate(R.id.action_register_fragment_to_registerSuccessFragment)
        }


    }
}
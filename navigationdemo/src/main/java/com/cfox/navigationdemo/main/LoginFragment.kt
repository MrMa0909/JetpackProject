package com.cfox.navigationdemo.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cfox.navigationdemo.R

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            findNavController().navigateUp()
        }

        view.findViewById<Button>(R.id.btn_register).setOnClickListener {
            findNavController().navigate(R.id.action_login_fragment_to_register_fragment)
        }

        view.findViewById<Button>(R.id.btn_forget).setOnClickListener {
            findNavController().navigate(R.id.action_login_fragment_to_forget_pwd_fragment)
        }
    }
}
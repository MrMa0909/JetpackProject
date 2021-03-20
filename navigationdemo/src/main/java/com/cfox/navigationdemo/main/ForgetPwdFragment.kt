package com.cfox.navigationdemo.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.cfox.navigationdemo.R

class ForgetPwdFragment : Fragment(R.layout.fragment_forget_pwd) {


    private val args : ForgetPwdFragmentArgs by navArgs()
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userName = args.userName
        val userPwd = args.userPwd

        view.findViewById<TextView>(R.id.msg_tips).text = "user:$userName  pwd:$userPwd"


        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
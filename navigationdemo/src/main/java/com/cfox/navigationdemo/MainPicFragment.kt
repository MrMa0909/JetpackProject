package com.cfox.navigationdemo


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class MainPicFragment : Fragment(R.layout.fragment_main_pic) {


    private val args : MainPicFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mgs = args.msg
        view.findViewById<TextView>(R.id.msg_tips).text = mgs

    }


}
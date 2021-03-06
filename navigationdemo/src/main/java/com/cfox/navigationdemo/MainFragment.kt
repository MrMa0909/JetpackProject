package com.cfox.navigationdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_open_login).setOnClickListener {
            findNavController().navigate(R.id.action_fragment_main_to_loginFragment)
        }

        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            findNavController().navigateUp()
        }
    }

}
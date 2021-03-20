package com.cfox.navigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setParamsToFistFragment()

        findViewById<Button>(R.id.btn_activity_main).setOnClickListener {
//            findNavController()

        }
    }

    /**
     * 向首页传递参数的三种方法
     */
    private fun setParamsToFistFragment() {
        val paramsBundle = Bundle()
        paramsBundle.putString("msg", "hello world this is pic")

//        val picGraph = findNavController(R.id.mac_nav_main_pic).graph
//        findNavController(R.id.mac_nav_main_pic).setGraph(picGraph,paramsBundle)  // 第一种
        findNavController(R.id.mac_nav_main_pic).setGraph(R.navigation.nav_main_pic, paramsBundle) // 第二种

        // 手动创建 创建NavHostFragment 的时候传递参数
//        NavHostFragment.create(R.navigation.nav_main_pic, paramsBundle)
    }
}
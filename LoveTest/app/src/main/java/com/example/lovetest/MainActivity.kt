package com.example.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nav_host_fragment = null
        navController = nav_host_fragment.findNavController()
    }
}
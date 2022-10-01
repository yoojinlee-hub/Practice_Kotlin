package com.example.kotlinapplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secound.*

class SecoundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        if(intent.hasExtra("WMI")){
            tv_id2.text = intent.getStringExtra("WMI") //value값이 넘어옴
        }
    }
}
package com.example.kotlinapplogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_secound.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener(){
            //Intent 화면전환 key->value / id->id
            val intent = Intent(this,SecoundActivity::class.java)//화면전환

            //id가 다음화면에 보여야함
            intent.putExtra("WMI",ed_id.text.toString())
            startActivity(intent)
        }
    }
}
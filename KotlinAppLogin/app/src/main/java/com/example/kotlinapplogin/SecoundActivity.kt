package com.example.kotlinapplogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_secound.*
import kotlinx.android.synthetic.main.activity_third.*

class SecoundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        if(intent.hasExtra("WMI")){
            tv_id2.text = intent.getStringExtra("WMI") //value값이 넘어옴
        }
        val intent = Intent(this,ThirdActivity::class.java)//화면전환

        web_V.settings.javaScriptEnabled = true
        web_V.webViewClient = WebViewClient()
        //web_V.webChromeClient = webChromeClient()
        //url address
        web_V.loadUrl("https://eclass.dongduk.ac.kr/ilos/main/main_form.acl")
    }
}
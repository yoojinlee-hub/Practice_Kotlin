package com.example.kotlinapplogin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        web_V.settings.javaScriptEnabled = true
        web_V.webViewClient = WebViewClient()
        //web_V.webChromeClient = webChromeClient()
        //url address
        web_V.loadUrl("https://eclass.dongduk.ac.kr/ilos/main/main_form.acl")
    }
}
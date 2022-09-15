package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000  //3 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        animationView.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val handler = Handler(Looper.getMainLooper())
        val runnable = Runnable{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable,3000)

        
        //https://velog.io/@sinbee0402/AndroidKotlin-Lottie-Splash
        Handler(Looper.getMainLooper()).postDelayed({  //3초(SPLASH_TIME_OUT)가 지나면 이 메서드가 실행됨
            //main activity 시작
            startActivity(Intent(this, MainActivity::class.java))
            //액티비티 닫기
            finish()
        }, SPLASH_TIME_OUT)
    }

}
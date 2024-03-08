package com.example.creativeband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        val splashDelay: Long = 3000 // 3 seconds delay

        Handler().postDelayed({
            // Start your main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashDelay)
    }
}
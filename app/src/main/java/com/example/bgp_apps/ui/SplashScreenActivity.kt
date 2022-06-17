package com.example.bgp_apps.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.bgp_apps.ChecklayoutActivity
import com.example.bgp_apps.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        setFullscreen(window)
        lightStatusBar(window)
        Handler().postDelayed({
            val inten = Intent(this, ChecklayoutActivity::class.java)
            startActivity(inten)
            finish()
        }, 3000)
    }
}
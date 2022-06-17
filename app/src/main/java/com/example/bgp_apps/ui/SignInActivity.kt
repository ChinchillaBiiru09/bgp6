package com.example.bgp_apps.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bgp_apps.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        tv_sgn_signup.setOnClickListener {
            val inten = Intent(this, SignUpActivity::class.java)
            startActivity(inten)
        }
    }
}
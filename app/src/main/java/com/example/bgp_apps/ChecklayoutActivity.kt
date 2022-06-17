package com.example.bgp_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bgp_apps.ui.MainActivity
import com.example.bgp_apps.ui.SignInActivity
import com.example.bgp_apps.ui.SignUpActivity
import kotlinx.android.synthetic.main.activity_checklayout.*

class ChecklayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklayout)

        var inten = Intent()

        button.setOnClickListener {
            inten = Intent(this, SignInActivity::class.java)
            startActivity(inten)
        }

        button2.setOnClickListener {
            inten = Intent(this, SignUpActivity::class.java)
            startActivity(inten)
        }

        button3.setOnClickListener {
            inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }

        button4.setOnClickListener {
            inten = Intent(this, FilesActivity::class.java)
            startActivity(inten)
        }
    }
}
package com.example.bgp_apps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bgp_apps.R
import com.example.bgp_apps.ui.fragment.DashboardFragment
import com.example.bgp_apps.ui.fragment.MyDriveFragment
import com.example.bgp_apps.ui.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bot_nav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_dashboard -> { DashboardFragment() }
                R.id.menu_files -> { MyDriveFragment() }
                R.id.menu_profile -> { ProfileFragment() }
            }
            true
        }
    }

    private fun setUi(){

    }
}
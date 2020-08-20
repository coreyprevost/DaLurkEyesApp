package com.coreypre.dalurkeyesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_loginactivity.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_loginactivity)
        btn_Login.setOnClickListener {
            Log.d("loginActivity", "Login attempted")
        }

        btn_Back.setOnClickListener {
            Log.d("loginActivity", "Back Button Pressed")
          finish()
        }
    }
}

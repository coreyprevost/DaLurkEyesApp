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

        btn_Back.setOnClickListener {
            Log.d("loginActivity", "Back Button Pressed")
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}

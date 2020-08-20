package com.coreypre.dalurkeyesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Register.setOnClickListener {
            val email = et_Email.text.toString()
            val password = et_Password.text.toString()
            Log.d("Main Activity","The email is " + email)
            Log.d("Main Activity","The password is " + password)
            Toast.makeText(this, "Email and Password Registered", Toast.LENGTH_LONG).show()

        }
        tv_AlreadyHaveAnAccount.setOnClickListener {
            Log.d("Main Activity", "Try to open login Activity")
        }
    }
}
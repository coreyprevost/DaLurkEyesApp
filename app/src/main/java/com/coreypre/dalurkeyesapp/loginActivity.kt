package com.coreypre.dalurkeyesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
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
    private fun performLogin(){
        val email = editTextTextEmailAddress.text.toString()
        val password = editTextTextPassword.text.toString()
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Mannnn this shit empty! Write something!", Toast.LENGTH_LONG)
                .show()
            return
        }

        Log.d("Main Activity","The email is " + email)
        Log.d("Main Activity","The password is " + password)
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener  Toast.makeText(this, "Mannnn stop playing, that ain't how you supposed to ", Toast.LENGTH_LONG).show()


                Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")
                Toast.makeText(this, "Login Successful. Welcome back!", Toast.LENGTH_LONG).show()

            }
            .addOnFailureListener {
                Log.d("Main", "This shit aint work pimp, here's why:, ${it.message}")

            }
    }
}

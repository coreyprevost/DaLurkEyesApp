package com.coreypre.dalurkeyesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Register.setOnClickListener {
            performRegister()


        }
        tv_AlreadyHaveAnAccount.setOnClickListener {
            Log.d("Main Activity", "Try to open login Activity")
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

    }
    private fun performRegister(){
        val email = et_Email.text.toString()
        val password = et_Password.text.toString()
        if (email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Mannnn this shit empty! Write something!", Toast.LENGTH_LONG).show()
            return
        }
        Log.d("Main Activity","The email is " + email)
        Log.d("Main Activity","The password is " + password)
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (!it.isSuccessful) return@addOnCompleteListener  Toast.makeText(this, "Mannnn stop playing, that ain't how you supposed to ", Toast.LENGTH_LONG).show()


                Log.d("Main", "Successfully created user with uid: ${it.result?.user?.uid}")
                Toast.makeText(this, "Email and Password Registered", Toast.LENGTH_LONG).show()

            }
            .addOnFailureListener {
                Log.d("Main", "This shit aint work pimp, here's why:, ${it.message}")

            }
    }
}
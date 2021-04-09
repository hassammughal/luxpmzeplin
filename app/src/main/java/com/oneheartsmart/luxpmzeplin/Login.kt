package com.oneheartsmart.luxpmzeplin

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login = findViewById<Button>(R.id.button3)
        login.setOnClickListener{
            val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
            val pass = findViewById<EditText>(R.id.editTextTextPassword)
            val mUsername: String = email.text.toString()
            val mPassword: String = pass.text.toString()
            if (mUsername == "test@luxpmsoft.com" && mPassword == "test1234!"){
                val sIntent = Intent(this, Home::class.java)
                startActivity(sIntent)
            }else{
                Toast.makeText(this@Login, "You entered invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }

        val signup = findViewById<Button>(R.id.button4)
        signup.setOnClickListener{
            val sIntent = Intent(this, SignUp::class.java)
            startActivity(sIntent)
        }
        signup.paintFlags = signup.paintFlags or Paint.UNDERLINE_TEXT_FLAG

    }
}
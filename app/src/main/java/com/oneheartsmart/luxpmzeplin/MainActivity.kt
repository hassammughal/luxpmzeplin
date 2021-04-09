package com.oneheartsmart.luxpmzeplin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signup = findViewById<Button>(R.id.button)
// set on-click listener
        signup.setOnClickListener {
            val sIntent = Intent(this, SignUp::class.java)
            startActivity(sIntent)
        }

        val login = findViewById<Button>(R.id.button2)
        login.setOnClickListener{
            val lIntent = Intent(this, Login::class.java)
            startActivity(lIntent)
        }
    }
}
package com.oneheartsmart.luxpmzeplin

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.text.format.Time
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener{
            val lIntent = Intent(this, Login::class.java)
            startActivity(lIntent)
        }
        btnLogin.paintFlags = btnLogin.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        val etDob = findViewById<EditText>(R.id.et_dob)
        etDob.setOnClickListener {

            val dpd =
                OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    val s = monthOfYear + 1
                    val a = "$dayOfMonth/$s/$year"
                    etDob.setText("" + a)
                }

            val date = Time()
            val d = DatePickerDialog(this@SignUp, dpd, date.year, date.month, date.monthDay)
            d.show()
        }

    }
}
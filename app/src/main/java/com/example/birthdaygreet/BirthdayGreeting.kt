package com.example.birthdaygreet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class BirthdayGreeting : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val getname = intent.getStringExtra("name")
       val birthday=findViewById<TextView>(R.id.birthday)
        birthday.setText("Happy birthday \n $getname")
    }

    fun BackGo(view: View) {
        startActivity(Intent(this,MainActivity::class.java))
    }
}
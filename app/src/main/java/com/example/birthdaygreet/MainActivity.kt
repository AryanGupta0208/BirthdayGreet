package com.example.birthdaygreet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText



)
    }class MainActivity : AppCompatActivity(){

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        }
        fun createBirthCard(view: View) {
            val name= findViewById<EditText>(R.id.edittext).editableText.toString()
            Toast.makeText(this,"Kripya Sabar Kare $name",Toast.LENGTH_LONG).show()
            val intent= Intent(this, BirthdayGreeting::class.java)

            intent.putExtra("name",name)
            startActivity(intent)
}
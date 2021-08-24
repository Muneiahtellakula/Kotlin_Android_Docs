package com.example.intentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
var et:EditText?=null
var et1:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et=findViewById(R.id.editTextTextPersonName)
        et1=findViewById(R.id.editTextTextPersonName2)

            et!!.setText(intent?.getStringExtra("Username"))
            et1!!.setText(intent?.getStringExtra("Password"))



    }

    fun login(view: View) {

    }
    fun register(view: View) {
       intent=Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}
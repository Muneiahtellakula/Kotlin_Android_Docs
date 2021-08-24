package com.example.intentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

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
        if (et?.text.toString().isEmpty() || et1?.text.toString().isEmpty()) {
            Snackbar.make(view, "Fill the Name and Password", Snackbar.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Success",Toast.LENGTH_LONG).show()
        }

    }
    fun register(view: View) {
       intent=Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}
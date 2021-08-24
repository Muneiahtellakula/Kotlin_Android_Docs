package com.example.intentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    var uname:EditText?=null
    var password:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        uname=findViewById(R.id.editText_reg)
        password=findViewById(R.id.editText_pass_reg)
    }

    fun saveAndContinoue(view: View) {
        val intent = Intent(this,MainActivity::class.java);
        intent.putExtra("Username", uname?.text)
        intent.putExtra("Password", password?.text)
        startActivity(intent);
    }
}
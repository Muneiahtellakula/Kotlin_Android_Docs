package com.example.intentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import java.net.URI
import java.net.URL

class RegisterActivity : AppCompatActivity() {
    var uname: EditText? = null
    var password: EditText? = null
    var et_url: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        uname = findViewById(R.id.editText_reg)
        password = findViewById(R.id.editText_pass_reg)
        et_url=findViewById(R.id.editTextTextPersonName3)
    }

    fun saveAndContinoue(view: View) {
        var n = uname?.text.toString()
        var p = password?.text.toString()
        var intent = Intent(this, MainActivity::class.java);
        if (n.isEmpty() || p.isEmpty()) {
            Snackbar.make(view, "Fill the Name and Password", Snackbar.LENGTH_LONG).show()
        } else {
            intent.putExtra("Username", n)
            intent.putExtra("Password", p)
            startActivity(intent);
        }
    }

    fun openWeb(view: View) {
        var data=et_url?.text.toString()
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type="text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, data);
        startActivity(Intent.createChooser(shareIntent,getString(R.string.send_to)))
        //val url:URL?=null


    }
}
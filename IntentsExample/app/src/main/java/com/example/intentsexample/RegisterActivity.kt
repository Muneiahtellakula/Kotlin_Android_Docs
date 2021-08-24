package com.example.intentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    var uname: EditText? = null
    var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        uname = findViewById(R.id.editText_reg)
        password = findViewById(R.id.editText_pass_reg)
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
}
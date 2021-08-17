package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    //Initialize the varibles
    var count_button: Button? = null
    var toast_button: Button? = null
    var decount_button: Button? = null
    var tv_countValue: TextView? = null
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //connet the every view or component Id from XML file
        count_button = findViewById(R.id.button_plus)
        decount_button = findViewById(R.id.button_minus)
        toast_button = findViewById(R.id.btn_toast)
        tv_countValue = findViewById(R.id.textView)
        //for toast message/shorter message
        toast_button!!.setOnClickListener(View.OnClickListener {
          /*  Snackbar.make(View,counter.toString(),Snackbar.LENGTH_LONG).show()*/
            Toast.makeText(applicationContext,"This is a TOAST message and Count Vlaue is "+counter.toString(),Toast.LENGTH_SHORT).show()
        })
        //for increment
        count_button!!.setOnClickListener(View.OnClickListener {
            counter++
            tv_countValue!!.text = counter.toString()
        })
        //for decrement
        decount_button!!.setOnClickListener(View.OnClickListener {
            counter--
            tv_countValue!!.text = counter.toString()
        })

    }
}
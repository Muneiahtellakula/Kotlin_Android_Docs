package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.widget.TextView
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    var tv_label:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_label=findViewById(R.id.tv)
        tv_label!!.append("onCreate()\n")
        Toast.makeText(this,"App is Created",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onCreate()\n")

    }

    override fun onStart() {
        super.onStart()
        tv_label!!.append("onStart()\n")
        Toast.makeText(this,"App is Started",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onStarted()\n")
    }

    override fun onResume() {
        super.onResume()
        tv_label!!.append("onResume()\n")
        Toast.makeText(this,"App is Resumed",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onResume()\n")
    }

    override fun onPause() {
        super.onPause()
        tv_label!!.append("onPause()\n")
        Toast.makeText(this,"App is Paused",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onPauese\n")
    }

    override fun onStop() {
        super.onStop()
        tv_label!!.append("onStop()\n")
        Toast.makeText(this,"App is Stop",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onStop()\n")
    }

    override fun onRestart() {
        super.onRestart()
        tv_label!!.append("onRestart()\n")
        Toast.makeText(this,"App is Restarted",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onRestarted()\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        tv_label!!.append("onDestroy()\n")
        Toast.makeText(this,"App is Destoryed",Toast.LENGTH_LONG).show()
        val Log = Logger.getLogger(MainActivity::class.java.name)
        Log.info("onDestroy()\n")
    }
}

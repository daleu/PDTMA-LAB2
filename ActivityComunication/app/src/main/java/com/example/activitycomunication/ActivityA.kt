package com.example.activitycomunication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.i("INFO","ACTIVITY A 'OnCreate'")

        val buttonGoB = findViewById<Button>(R.id.GoB)
        buttonGoB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        val buttonQuit = findViewById<Button>(R.id.Quit)
        buttonQuit.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart();
        Log.i("INFO","ACTIVITY A 'OnStart'")
    }

    override fun onRestart() {
        super.onRestart();
        Log.i("INFO","ACTIVITY A 'onRestart'")
    }

    override fun onResume() {
        super.onResume();
        Log.i("INFO","ACTIVITY A 'onResume'")
    }

    override fun onPause() {
        super.onPause();
        Log.i("INFO","ACTIVITY A 'onPause'")
    }

    override fun onStop() {
        super.onStop();
        Log.i("INFO","ACTIVITY A 'onStop'")
    }

    override fun onDestroy() {
        super.onDestroy();
        Log.i("INFO","ACTIVITY A 'onDestroy'")
    }
}

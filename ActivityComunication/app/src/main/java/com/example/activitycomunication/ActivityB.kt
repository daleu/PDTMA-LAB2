package com.example.activitycomunication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.system.exitProcess

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.i("INFO","ACTIVITY B 'OnCreate'")

        val buttonQuit = findViewById<Button>(R.id.QuitB)
        buttonQuit.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart();
        Log.i("INFO","ACTIVITY B 'OnStart'")
    }

    override fun onRestart() {
        super.onRestart();
        Log.i("INFO","ACTIVITY B 'onRestart'")
    }

    override fun onResume() {
        super.onResume();
        Log.i("INFO","ACTIVITY B 'onResume'")
    }

    override fun onPause() {
        super.onPause();
        Log.i("INFO","ACTIVITY B 'onPause'")
    }

    override fun onStop() {
        super.onStop();
        Log.i("INFO","ACTIVITY B 'onStop'")
    }

    override fun onDestroy() {
        super.onDestroy();
        Log.i("INFO","ACTIVITY B 'onDestroy'")
    }
}

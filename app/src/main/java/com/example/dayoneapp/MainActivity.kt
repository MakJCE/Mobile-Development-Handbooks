package com.example.dayoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {
    private val swipeRefreshLayout: SwipeRefreshLayout
        get() = findViewById(R.id.swipe_refresh_layout)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.manual1).setOnClickListener{
            val intent = Intent(this, ActivityMain::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.manual2).setOnClickListener{
            val intent = Intent(this, ImageAndOnClickListenerActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.manual3).setOnClickListener{
            val intent = Intent(this, EvenAndOdd::class.java)
            startActivity(intent)
        }
        swipeRefreshLayout.setOnRefreshListener {
            swipeRefreshLayout.isRefreshing = false
        }
    }
}
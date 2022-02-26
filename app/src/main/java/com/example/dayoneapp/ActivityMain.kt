package com.example.dayoneapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import java.time.Duration

class ActivityMain : AppCompatActivity() {
    private val redBtn : Button
        get() = findViewById(R.id.red_btn)
    private val whiteBtn : Button
        get() = findViewById(R.id.white_btn)
    private val layoutPrincipal : ConstraintLayout
        get() = findViewById(R.id.layout_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        redBtn.setOnClickListener {
            toast(getString(R.string.red_button))
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        whiteBtn.setOnClickListener{
            toast(getString(R.string.white_button))
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
        Toast.makeText(this@ActivityMain, text, Toast.LENGTH_LONG).show()
}
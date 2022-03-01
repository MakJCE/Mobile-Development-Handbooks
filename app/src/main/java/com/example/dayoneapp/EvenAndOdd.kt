package com.example.dayoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EvenAndOdd : AppCompatActivity() {
    private val number_label: TextView
        get() = findViewById(R.id.main_number)
    private val success_label: TextView
        get() = findViewById(R.id.success_text)
    private val wrongs_label: TextView
        get() = findViewById(R.id.wrongs_text)
    private var success_counter: Int = 0
    private var wrongs_counter: Int = 0
    private var main_number: Int = (1..100).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_even_and_odd)
        number_label.text = main_number.toString()
        findViewById<Button>(R.id.even_btn).setOnClickListener{
            if (main_number%2 == 0){
                success_counter += 1
                success_label.text = success_counter.toString()
            }
            else{
                wrongs_counter += 1
                wrongs_label.text = wrongs_counter.toString()
            }
            main_number = (1..100).random()
            number_label.text = main_number.toString()
        }
        findViewById<Button>(R.id.odd_btn).setOnClickListener{
            if (main_number%2 != 0){
                success_counter += 1
                success_label.text = success_counter.toString()
            }
            else{
                wrongs_counter += 1
                wrongs_label.text = wrongs_counter.toString()
            }
            main_number = (1..100).random()
            number_label.text = main_number.toString()
        }
    }
}
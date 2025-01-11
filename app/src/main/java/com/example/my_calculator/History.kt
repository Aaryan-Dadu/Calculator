package com.example.my_calculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_history)

        var histArr = intent.getIntArrayExtra("hist") ?: intArrayOf(0,0,0,0,0)

//        var a = intent.getIntExtra("a", 0)
        var hist1=findViewById<TextView>(R.id.hist1)
        var hist2=findViewById<TextView>(R.id.hist2)
        var hist3=findViewById<TextView>(R.id.hist3)
        var hist4=findViewById<TextView>(R.id.hist4)
        var hist5=findViewById<TextView>(R.id.hist5)
        hist1.text="${histArr[0]}"
        hist2.text="${histArr[1]}"
        hist3.text="${histArr[2]}"
        hist4.text="${histArr[3]}"
        hist5.text="${histArr[4]}"
    }
}
package com.example.appproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btn1 = 0
    var btn2 = 0
    var btn3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.displayTextView)

        val tap1 = findViewById<Button>(R.id.button1)
        tap1.setOnClickListener{
            btn1++
            tv.setText("Tap1")
        }
        val tap2 = findViewById<Button>(R.id.button2)
        tap2.setOnClickListener{
            btn2++
            tv.setText("Tap2")
        }
        val tap3 = findViewById<Button>(R.id.button3)
        tap3.setOnClickListener{
            btn3++
            tv.setText("Tap3")
        }
    }

}
package com.example.diceroller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll.setOnClickListener {
            val rollBtn: Button = findViewById(R.id.btnRoll)
            btnRoll.text = "Touched"
            btnRoll.setTextColor(Color.BLACK)
            btnRoll.setBackgroundColor(Color.RED)

        }
    }

}
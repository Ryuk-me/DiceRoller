package com.example.diceroller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener {
            rollDice()
//            btnRoll.text = "Touched"
//            btnRoll.setTextColor(Color.BLACK)
//            btnRoll.setBackgroundColor(Color.RED)

        }
        diceImage = findViewById(R.id.imageV)
    }

    private fun rollDice() {
        val randomNumber = Random().nextInt(6) + 1
        val diceShow = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceShow)
        btnRoll.text = "$randomNumber"
        //Toast.makeText(this,"$randomNumber", Toast.LENGTH_SHORT).show()

    }

}
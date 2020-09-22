package com.example.diceroller2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var imageview : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.button_roll)
        val text : TextView = findViewById(R.id.text0)

        rollbutton.setOnClickListener{

            rollDice()
            val arr  = 1..6
            val number = arr.random()
            imageview =  findViewById(R.id.number_rolled)

            val text_val = when (rollbutton.text){
                "Roll!" -> "Roll Again!"
                else -> "Roll Again!"
            }
            rollbutton.text  = text_val
            text.text = number.toString()
            when (number) {
                1 -> imageview.setImageResource(R.drawable.dice_1)
                2 -> imageview.setImageResource(R.drawable.dice_2)
                3 -> imageview.setImageResource(R.drawable.dice_3)
                4 -> imageview.setImageResource(R.drawable.dice_4)
                5 -> imageview.setImageResource(R.drawable.dice_5)
                6 -> imageview.setImageResource(R.drawable.dice_6)
            }


        }


    }
    private fun rollDice(){
        Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()

    }
}
package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dice(sides : Int){
    private val range = 1..sides
    fun roll() : Int{
        return range.random()
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()

        }

    }

    private fun rollDice() {
        val d = 8
        if (d >5) {
            println("blabla")
        } else {
            println("boom")
        }
        when (d) {
           3 -> println("cool")
           8 -> println("the number is 8")
        }
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage : ImageView = findViewById(R.id.imageView)
        val ImageValue = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(ImageValue)
        diceImage.contentDescription = diceRoll.toString()
         // resultTextView.text = diceRoll.toString()
    }
}
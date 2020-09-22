package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listener()
        buttonClick()

    }
    private fun listener(){
        val f : TextView = findViewById(R.id.box_one_text)
        val s : TextView = findViewById(R.id.box_two_text)
        val t : TextView = findViewById(R.id.box_three_text)
        val fo : TextView = findViewById(R.id.box_four_text)
        val fi : TextView = findViewById(R.id.box_five_text)
        val cons : ConstraintLayout = findViewById(R.id.constraint_layer)

        val arr : List<View> = listOf(f,s,t,fo,fi)
        for (item in arr){
            item.setOnClickListener{ makeColored(item) }
        }
    }
    private fun buttonClick(){
        val yell : Button = findViewById(R.id.yellow_button)
        val green : Button = findViewById(R.id.green_button)
        val red : Button = findViewById(R.id.red_button)

        red.setOnClickListener{ coloredbutton("red")}
        green.setOnClickListener{ coloredbutton("green")}
        yell.setOnClickListener{ coloredbutton("yellow")}
    }
    private fun coloredbutton(col : String){
        val t : TextView = findViewById(R.id.box_three_text)
        val fo : TextView = findViewById(R.id.box_four_text)
        val fi : TextView = findViewById(R.id.box_five_text)
        when (col){
            "green" -> fi.setBackgroundResource(R.color.my_green)
            "red" -> t.setBackgroundResource(R.color.my_red)
            "yellow" -> fo.setBackgroundResource(R.color.my_yellow)
        }

    }

    private fun makeColored(view : View){
        when (view.id){

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.BLUE)

        }



    }
}
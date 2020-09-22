package com.example.aboutme3

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
            updateNickname(it)
        }
    }

    fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.my_button)
        editText.setText("")
        editText.visibility = View.VISIBLE
        editText.requestFocus()
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE


    }
    fun clickhandlerFunction(view: View) {
        val nicknameview : TextView = findViewById<EditText>(R.id.nickname_edit)
        val nickview : TextView = findViewById<TextView>(R.id.nickname_text)
        val nickname :String = nicknameview.text.toString()
        nickview.setText(nickname)
        nicknameview.setVisibility(View.GONE)
        val button : Button = findViewById(R.id.my_button)
        button.setVisibility(View.GONE)
        nickview.setVisibility(View.VISIBLE)

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
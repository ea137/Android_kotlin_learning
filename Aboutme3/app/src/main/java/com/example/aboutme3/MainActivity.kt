package com.example.aboutme3

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aboutme3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val namox: MyName = MyName(name = "Aleks ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = MyName()
        binding.nick = namox
        binding.nicknameText.setOnClickListener {
            updateNickname(it)
        }
    }

    private fun updateNickname (view: View) {
        val editText = binding.nicknameEdit
        val doneButton = binding.myButton
        editText.setText("")
        editText.visibility = View.VISIBLE
        editText.requestFocus()
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE


    }
    fun clickhandlerFunction(view: View) {
        val nicknameview : TextView = binding.nicknameEdit
        val nickview : TextView = binding.nicknameText
        val nickname :String = nicknameview.text.toString()
        binding.nick = MyName(nickname= nickname)
        /* OR
        binding.apply {
            nick.nickname = nickname
            invalidateAll() // UI refreshed

        }

         */
        // nickview.setText(nickname)
        nicknameview.setVisibility(View.GONE)
        val button : Button = findViewById(R.id.my_button)
        button.setVisibility(View.GONE)
        nickview.setVisibility(View.VISIBLE)
        /* OR
            binding.apply {
               nicknameText.text = nicknameEdit.text.toString()
               nicknameEdit.visibility = View.GONE
               doneButton.visibility = View.GONE
               nicknameText.visibility = View.VISIBLE
               }
}
         */

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
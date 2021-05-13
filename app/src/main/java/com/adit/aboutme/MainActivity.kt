package com.adit.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var doneButton:Button = findViewById(R.id.doneButton)

        doneButton.setOnClickListener{
            DisplayName(it);
        }
    }

    private fun DisplayName(view:View)
    {
        var nickName:EditText = findViewById(R.id.nickName)
        var displayText:TextView = findViewById(R.id.displayText)
        var doneButton:Button = findViewById(R.id.doneButton)
        displayText.text=nickName.text
        displayText.visibility = View.VISIBLE
        doneButton.visibility = View.GONE
        nickName.visibility = View.GONE
    }
}
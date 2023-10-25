package edu.uw.ischool.shiina12.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.greenButton)
        var counter = 0

        myButton.setOnClickListener {
            counter++
            Log.i("BUTTON", "pressed")
            if (counter == 1) {
                myButton.text = "You have pushed me 1 time!"
            } else {
                myButton.text = "You have pushed me $counter times!"
            }
        }
    }
}
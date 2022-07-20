package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

/*
MainActivity.kt (kt meaning kotlin)this Kotlin
file is where we're going to be handling user interactions
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show the layout file activity_main
        setContentView(R.layout.activity_main)

        /*
        Display customized text to show 'Hello from {Name}
        user can tap a button to change the color of the label
        1. add a button
        2. set logic to know when the user has tapped on the button
        3. change the color of the text
         */

        //get a reference to our button
        findViewById<Button>(R.id.button).setOnClickListener{
            // handles button tap by changing the text color
            Log.i("Robert", "Tapped on Button to change the text color")

            //get a reference to the text view and set the color
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }

        findViewById<Switch>(R.id.switch1).setOnClickListener {

            val click = Log.i("Robert", "Successfully changed the background of the application")
            val clickedButton = true

            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(
                androidx.constraintlayout.widget.R.id.parent
            ).setBackgroundColor(getResources().getColor(R.color.grey))
        }
    }
}
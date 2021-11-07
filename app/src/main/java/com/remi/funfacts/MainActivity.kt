package com.remi.funfacts

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val factBook = FactBook()
    private val colorWheel = ColorWheel()
    // Declare are view variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null

    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assign the views from the layout files to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactBtn)
        relativeLayout = findViewById(R.id.relativeLayout)

        // show it is not null with 2 exclamation
        showFactButton!!.setOnClickListener {
            val fact = factBook.getFact()
            val color = colorWheel.getColor()

            // Update screen with new fact
            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }

        Toast.makeText(this, "Yay!, Our Activity was created!", Toast.LENGTH_LONG).show()
        Log.d("MainActivity", "Were logging from the onCreate method")


    }
}
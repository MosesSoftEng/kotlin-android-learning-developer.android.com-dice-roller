package com.developer.android.dice.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         * Button object reference - Create and assign button variable.
         */
        val rollButton: Button = findViewById(R.id.button)


        // val button = Button(this);

        /*
         * Attach click event listener to button.
         */
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            /*
             * Reference and update textview text.
             */
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = "6"
        }

        // or
//        rollButton.setOnClickListener(View.OnClickListener {
//
//        })
    }
}
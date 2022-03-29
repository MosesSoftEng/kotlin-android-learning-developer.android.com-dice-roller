package com.developer.android.dice.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
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

            rollDice()
        }

        // or
//        rollButton.setOnClickListener(View.OnClickListener {
//
//        })
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6);
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    /**
     * Inner Class Dice
     */
    class Dice(
        private val numSides: Int // Constructor Parameter 1
    ) {

        /**
         * Function
         */
        fun roll(): Int /*Return type*/ {
            return (1..numSides).random()
        }
    }
}
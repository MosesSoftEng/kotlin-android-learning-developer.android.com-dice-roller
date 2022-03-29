package com.developer.android.dice.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
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
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"

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

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()

        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()

//        val diceRoll1 = dice.roll()

        // Update the screen with the dice roll
//        val resultTextView1: TextView = findViewById(R.id.textView1)
//        resultTextView1.text = diceRoll1.toString()
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
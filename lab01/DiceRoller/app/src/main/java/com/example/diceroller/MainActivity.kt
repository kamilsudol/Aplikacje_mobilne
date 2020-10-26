package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice()}

        //val countButton: Button = findViewById(R.id.count_button)
        //countButton.setOnClickListener { CountUp()}
    }
/*
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun CountUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else if(Integer.parseInt(resultText.text.toString()) < 6){
            var Int = Integer.parseInt(resultText.text.toString()) +1
            resultText.text = Int.toString();
        }
    }*/
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        //val randomInt2 = Random().nextInt(6) + 1
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val diceImage2: ImageView = findViewById(R.id.dice_image2)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        val random = Random().nextInt(6) + 1
        val drawableRes = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawableRes)

}


}
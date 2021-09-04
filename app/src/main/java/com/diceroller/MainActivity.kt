package com.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    //
    // Two ways to declare a variable
    //
    // In this we have to check everytime a NULL check by  ? questionmark
   // var diceImage : ImageView? = null
    //
    //
    // In this we ensure to use a variable after its initialization
    lateinit var diceImage : ImageView
    val a:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        var a = 120

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt  = Random().nextInt(6) + 1
        val drawableResource = when (randomInt){
            1 -> {
                R.drawable.dice_1
            }
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        Toast.makeText(this,randomInt.toString(),Toast.LENGTH_SHORT).show()
    }

}
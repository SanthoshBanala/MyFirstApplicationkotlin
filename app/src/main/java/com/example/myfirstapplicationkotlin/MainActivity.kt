package com.example.myfirstapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gobutton:Button= findViewById(R.id.go_button)
        gobutton.setOnClickListener {
            diceRoll()
                                    }
    }

    private fun diceRoll() {
        val randonNum = Random().nextInt(6)+1

        val nextImg = when(randonNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImg:ImageView = findViewById(R.id.dice_Image)
        diceImg.setImageResource(nextImg)
    }


}
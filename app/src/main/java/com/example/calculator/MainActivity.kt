package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var numberText: TextView

        val oneButton: Button = findViewById(R.id.button_one)
        val twoButton: Button = findViewById(R.id.button_two)
        val threeButton: Button = findViewById(R.id.button_three)
        val fourButton: Button = findViewById(R.id.button_four)
        val fiveButton: Button = findViewById(R.id.button_five)
        val sixButton: Button = findViewById(R.id.button_six)
        val sevenButton: Button = findViewById(R.id.button_seven)
        val eightButton: Button = findViewById(R.id.button_eight)
        val nineButton: Button = findViewById(R.id.button_nine)
        val plusButton: Button = findViewById(R.id.button_plus)
        val minusButton: Button = findViewById(R.id.button_minus)
        val equalsButton: Button = findViewById(R.id.button_equals)

        numberText = findViewById(R.id.answer)
        var textString: String =""
        var first: Int=0
        var second: Int=0
        var temp: String = ""
        var symbol: String = ""

        oneButton.setOnClickListener() {
                textString += "1"
                numberText.setText(textString)
        }
        twoButton.setOnClickListener() {
            textString += "2"
            numberText.setText(textString)
        }
        threeButton.setOnClickListener() {
            textString += "3"
            numberText.setText(textString)
        }
        fourButton.setOnClickListener() {
            textString += "4"
            numberText.setText(textString)
        }
        fiveButton.setOnClickListener() {
            textString += "5"
            numberText.setText(textString)
        }
        sixButton.setOnClickListener() {
            textString += "6"
            numberText.setText(textString)
        }
        sevenButton.setOnClickListener() {
            textString += "7"
            numberText.setText(textString)
        }
        eightButton.setOnClickListener() {
            textString += "8"
            numberText.setText(textString)
        }
        nineButton.setOnClickListener() {
            textString += "9"
            numberText.setText(textString)
        }
        plusButton.setOnClickListener() {
            first = textString.toInt()
            textString += "+"
            temp = textString
            numberText.setText(textString)
        }
        minusButton.setOnClickListener() {
            first = textString.toInt()
            textString += "-"
            temp = textString
            numberText.setText(textString)
        }
        equalsButton.setOnClickListener() {
            symbol = temp.substring((temp.length-1))
            temp = textString.substring(temp.length,textString.length)
            second = temp.toInt()
            if(symbol ==  "+") {
                var answer = first+second
                numberText.setText(answer.toString())
            }
            if(symbol ==  "-") {
                var answer = first-second
                numberText.setText(answer.toString())
            }
        }
    }
}

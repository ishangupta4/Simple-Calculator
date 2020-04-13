package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        lateinit var numberText: TextView

//        val oneButton: Button = findViewById(R.id.button_one)
//        val twoButton: Button = findViewById(R.id.button_two)
//        val threeButton: Button = findViewById(R.id.button_three)
//        val fourButton: Button = findViewById(R.id.button_four)
//        val fiveButton: Button = findViewById(R.id.button_five)
//        val sixButton: Button = findViewById(R.id.button_six)
//        val sevenButton: Button = findViewById(R.id.button_seven)
//        val eightButton: Button = findViewById(R.id.button_eight)
//        val nineButton: Button = findViewById(R.id.button_nine)
//        val plusButton: Button = findViewById(R.id.button_plus)
//        val minusButton: Button = findViewById(R.id.button_minus)
//        val equalsButton: Button = findViewById(R.id.button_equals)

        numberText = findViewById(R.id.answer)
        var textString: String =""
        var first: Int=0
        var second: Int=0
        var temp: String = ""
        var symbol: String = ""

        binding.buttonOne.setOnClickListener() {
                textString += "1"
                numberText.setText(textString)
        }
        binding.buttonTwo.setOnClickListener() {
            textString += "2"
            numberText.setText(textString)
        }
        binding.buttonThree.setOnClickListener() {
            textString += "3"
            numberText.setText(textString)
        }
        binding.buttonFour.setOnClickListener() {
            textString += "4"
            numberText.setText(textString)
        }
        binding.buttonFive.setOnClickListener() {
            textString += "5"
            numberText.setText(textString)
        }
        binding.buttonSix.setOnClickListener() {
            textString += "6"
            numberText.setText(textString)
        }
        binding.buttonSeven.setOnClickListener() {
            textString += "7"
            numberText.setText(textString)
        }
        binding.buttonEight.setOnClickListener() {
            textString += "8"
            numberText.setText(textString)
        }
        binding.buttonNine.setOnClickListener() {
            textString += "9"
            numberText.setText(textString)
        }
        binding.buttonPlus.setOnClickListener() {
            first = textString.toInt()
            textString += "+"
            temp = textString
            numberText.setText(textString)
        }
        binding.buttonMinus.setOnClickListener() {
            first = textString.toInt()
            textString += "-"
            temp = textString
            numberText.setText(textString)
        }
        binding.buttonEquals.setOnClickListener() {
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

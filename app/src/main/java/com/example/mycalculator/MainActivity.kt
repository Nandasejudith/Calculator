package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAdd = findViewById<Button>(R.id.btnAddition)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnModulous = findViewById<Button>(R.id.btnModulous)

        var etFirstNumber = findViewById<EditText>(R.id.etfirstNo)
        var etSecondNumber = findViewById<EditText>(R.id.etsecondNo)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {

                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val sum = num1 + num2
            tvResult.setText(sum.toString())
            }

        btnMultiply.setOnClickListener {

                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val multiply = num1 * num2
            tvResult.setText(multiply.toString())
            }

        btnSubtract.setOnClickListener {

                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val subtract = num1 - num2
            tvResult.setText(subtract.toString())
            }

        btnModulous.setOnClickListener {


                val num1 = etFirstNumber.text.toString().toInt()
                val num2 = etSecondNumber.text.toString().toInt()
                val modulus = num1 % num2
                tvResult.setText(modulus.toString())



        }
    }
}
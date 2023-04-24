package com.hakancevik.testintroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val netIncome = tax.calculateIncome(20000.0, 0.1)
        val netTax = tax.calculateTax(20000.0, 0.1)

        println("Net Income: $netIncome")
        println("Net Tax: $netTax")


    }
}
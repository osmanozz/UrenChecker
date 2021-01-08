package com.androidtutorialshub.loginregisterkotlin.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.androidtutorialshub.loginregisterkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener(){
            multiply()
        }
    }

    fun multiply(){
        if (inputIsNotEmpty()){
            val input1 = textView1.text.toString().trim().toBigDecimal()
            val input2 = textView2.text.toString().trim().toBigDecimal()
            txtResult.text = input1.multiply(input2).toString()
        }
    }
    fun inputIsNotEmpty():Boolean {
        var b = true
        if (textView1.text.toString().trim().isEmpty()){
            textView1.error = "Required"
            b = false
        }
        if (textView2.text.toString().trim().isEmpty()){
            textView2.error = "Required"
        }
        return b
    }
}
package com.androidtutorialshub.loginregisterkotlin.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.androidtutorialshub.loginregisterkotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class UsersListActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_list)



        btnAdd.setOnClickListener() {
            var firstNum = txtNumber1.text.toString().toInt()
            var secondNum = txtNumber2.text.toString().toInt()
            var totaal = firstNum * secondNum


           txtResult.text = "Uw uurloon is €$firstNum per uur en u heeft in totaal " +
                   "$secondNum uren gewerkt. U heeft €$totaal verdient"
        }

    }
}

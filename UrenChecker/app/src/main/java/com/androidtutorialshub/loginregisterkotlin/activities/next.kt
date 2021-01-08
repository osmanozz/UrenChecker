package com.androidtutorialshub.loginregisterkotlin.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.androidtutorialshub.loginregisterkotlin.R
import kotlinx.android.synthetic.main.activity_login.*

class next : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        appCompatButtonLogin.setOnClickListener{
            val intent = Intent(this, UsersListActivity::class.java)
            startActivity(intent)
        }



    }
}


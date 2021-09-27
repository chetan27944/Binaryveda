package com.android.binaryveda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class RegisterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        val card_register = findViewById<CardView>(R.id.cv_register).setOnClickListener{
            startActivity(Intent(this@RegisterScreen, MainActivity::class.java))
        }


    }
}
package com.application.willhillapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutPage : AppCompatActivity() {

    private var btn1 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btn1 = findViewById(R.id.btnpp)
        btn1?.setOnClickListener{
            onBackPressed()
        }
    }
}
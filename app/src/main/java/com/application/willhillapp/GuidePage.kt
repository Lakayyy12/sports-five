package com.application.willhillapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GuidePage : AppCompatActivity() {

    private var btn2 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)

        btn2 = findViewById(R.id.btn)
        btn2?.setOnClickListener{
            onBackPressed()
        }
    }
}
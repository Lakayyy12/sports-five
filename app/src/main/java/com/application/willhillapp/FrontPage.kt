package com.application.willhillapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class FrontPage : AppCompatActivity() {

    private var homeButton: Button? = null
    private var about: ImageButton? = null
    private var img2: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

        homeButton = findViewById(R.id.homeButton)
        about = findViewById(R.id.bn1)
        img2 = findViewById(R.id.bn2)

        homeButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        about?.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
        img2?.setOnClickListener {
            val intent = Intent(this, GuidePage::class.java)
            startActivity(intent)
        }
    }
}
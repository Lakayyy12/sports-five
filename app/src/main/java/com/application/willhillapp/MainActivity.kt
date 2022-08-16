package com.application.willhillapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.application.willhillapp.Navigator.Companion.openPage
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity(), OnContentClickListener {

    private var layoutManager: LayoutManager? = null

    private val onItemClicked by lazy { this }

    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        initOnClicked()
    }

    private fun initRecyclerView(){
        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = RecyclerAdapter(onItemClicked)
    }
    private fun initOnClicked(){
        cdView?.setOnClickListener {
            openPage(this, ContentInside::class.java)
        }
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this,"CLICK AGAIN TO FRONTPAGE", Toast.LENGTH_SHORT).show()
        }
        else {
            finish()
        }
    }
    override fun OnContentItemClicked(image: Int, content: Int) {
        openPage(this, ContentInside::class.java, image, content)
    }
}

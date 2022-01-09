package com.nishajain.nestedscrollviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val horizontalRv = findViewById<RecyclerView>(R.id.horizontal_rv)
        val verticalRv = findViewById<RecyclerView>(R.id.vertical_rv)

        val data = ArrayList<RecyclerModel>()
        data.add(RecyclerModel(R.drawable.image1))
        data.add(RecyclerModel(R.drawable.image2))
        data.add(RecyclerModel(R.drawable.image8))
        data.add(RecyclerModel(R.drawable.image4))
        data.add(RecyclerModel(R.drawable.image5))
        data.add(RecyclerModel(R.drawable.image6))
        data.add(RecyclerModel(R.drawable.image7))
        data.add(RecyclerModel(R.drawable.image3))

        val adapter = RecyclerAdapter(data)

        horizontalRv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        horizontalRv.adapter = adapter

        verticalRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        verticalRv.adapter = adapter

    }
}
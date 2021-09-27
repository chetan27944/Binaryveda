package com.android.binaryveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  gridAdapter: GridAdapter
    private var dataList = mutableListOf<DataModel>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        gridAdapter = GridAdapter(applicationContext)
        recyclerView.adapter = gridAdapter

        dataList.add(DataModel(R.drawable.art_1))
        dataList.add(DataModel(R.drawable.art_2))
        dataList.add(DataModel(R.drawable.art_3))
        dataList.add(DataModel(R.drawable.art_4))
        dataList.add(DataModel(R.drawable.art_1))
        dataList.add(DataModel(R.drawable.art_2))



        gridAdapter.setDataList(dataList)
    }
}
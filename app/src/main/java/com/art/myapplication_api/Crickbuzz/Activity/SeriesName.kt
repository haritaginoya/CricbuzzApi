package com.art.myapplication_api.Crickbuzz.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.Adapter.SecondAdapter
import com.art.myapplication_api.Crickbuzz.DataClasses.SeriesMatches
import com.art.myapplication_api.R

class SeriesName : AppCompatActivity() {
    lateinit var recycle2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series_name)
        recycle2 = findViewById(R.id.recycle2)

        Log.d(
            "========",
            "onCreate:  ===>  ${intent.getSerializableExtra("matchtype") as ArrayList<*>}"
        )

        var seriesMatches = intent.getSerializableExtra("matchtype") as ArrayList<SeriesMatches>


        var serieslist = ArrayList<String>()


        Log.d("--====ff", "series list ==> : ${serieslist}")
        var adapter = SecondAdapter(this,seriesMatches)
        recycle2.adapter = adapter


    }
}
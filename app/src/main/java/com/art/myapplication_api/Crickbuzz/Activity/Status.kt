package com.art.myapplication_api.Crickbuzz.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.Adapter.StatusAdapter
import com.art.myapplication_api.Crickbuzz.DataClasses.Matches
import com.art.myapplication_api.R

class Status : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)
        var recycle : RecyclerView = findViewById(R.id.recycle3)


        var matches = intent.getSerializableExtra("matches") as ArrayList<Matches>


        try {

                var adapter = StatusAdapter(this,matches)
                recycle.adapter = adapter



        } catch (e: Exception) {
            Log.e("-===---=", "onCreate: ${e.message}")
        }


    }
}
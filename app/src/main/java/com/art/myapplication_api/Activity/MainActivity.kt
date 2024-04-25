package com.art.myapplication_api.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Adapter.FirstAdapter
import com.art.myapplication_api.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycle : RecyclerView = findViewById(R.id.recycle)
        try {
             Datareturn(this).getdata(){ss ->
                 Log.e("volley response", "onCreate: ${ss.filters}")
                 var adapter = FirstAdapter(this@MainActivity,ss.filters!!.matchType,1)
                 recycle.adapter = adapter

             }

        } catch (e: Exception) {
            Log.e("-===---=", "onCreate: ${e.message}")
        }
    }
}
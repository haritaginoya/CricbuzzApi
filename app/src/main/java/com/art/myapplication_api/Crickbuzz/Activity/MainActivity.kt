package com.art.myapplication_api.Crickbuzz.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Crickbuzz.Adapter.FirstAdapter
import com.art.myapplication_api.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycle : RecyclerView = findViewById(R.id.recycle)
        try {
             com.art.myapplication_api.Crickbuzz.Activity.Datareturn(this).getdata(){ ss ->
                 Log.e("volley response", "onCreate: ${ss.filters}")
                 var adapter = FirstAdapter(this@MainActivity,ss.typeMatches)
                 recycle.adapter = adapter


             }

        } catch (e: Exception) {
            Log.e("-===---=", "onCreate: ${e.message}")
        }
    }
}
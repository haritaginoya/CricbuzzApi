package com.art.myapplication_api.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Adapter.FirstAdapter
import com.art.myapplication_api.R

class SeriesName : AppCompatActivity() {
    lateinit var recycle2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series_name)
        recycle2 = findViewById(R.id.recycle2)


        var seriesname = intent.getStringExtra("seriesname")

        var serieslist = ArrayList<String>()
        Datareturn(this).getdata { data ->

            for (i in 0 until data.typeMatches.size) {
                if (data.typeMatches[i].matchType.equals(seriesname)) {
                    for (i1 in 0 until data.typeMatches[i].seriesMatches.size) {
                        if (data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.seriesName != null) {
                            serieslist.add(data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.seriesName!!)

                            Log.d(
                                "---test",
                                "onCreate: ${data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.seriesName}"
                            )
                        }
                    }
                }
            }
            Log.d("--====ff", "series list ==> : ${serieslist}")
            var adapter = FirstAdapter(this, serieslist, 2)
            recycle2.adapter = adapter
        }


    }
}
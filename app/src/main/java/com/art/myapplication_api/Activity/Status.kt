package com.art.myapplication_api.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.Adapter.FirstAdapter
import com.art.myapplication_api.R

class Status : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)
        var recycle : RecyclerView = findViewById(R.id.recycle3)


        var seriesname = intent.getStringExtra("seriesname")
        var matchtype = intent.getStringExtra("matchtype")
        var statuslist = ArrayList<String>()

        try {
            Datareturn(this).getdata{data ->
                Log.e("volley response", "onCreate: ${data.filters}")
                for (i in 0 until data.typeMatches.size) {
                    if (data.typeMatches[i].matchType.equals(matchtype)) {
                        for (i1 in 0 until data.typeMatches[i].seriesMatches.size) {
                            if(data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.seriesName.equals(seriesname)) {
                                for (i2 in 0 until data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.matches.size) {

                                    Log.d(
                                        "---teststatus",
                                        "onCreate: ${data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.matches[i2].matchInfo!!.status}"
                                    )
                                    statuslist.add(data.typeMatches[i].seriesMatches[i1].seriesAdWrapper!!.matches[i2].matchInfo!!.status!!)
                                }
                            }
                        }
                    }
                }

                var adapter = StatusAdapter(this,statuslist)
                recycle.adapter = adapter

            }

        } catch (e: Exception) {
            Log.e("-===---=", "onCreate: ${e.message}")
        }


    }
}
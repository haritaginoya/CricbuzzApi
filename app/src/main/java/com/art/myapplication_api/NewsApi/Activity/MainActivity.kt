package com.art.myapplication_api.NewsApi.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.R

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    var contryname_map = HashMap<String, String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        contryname_map["India"] = "in"
        contryname_map["Canada"] = "ca"
        contryname_map["America"] = "us"
        contryname_map["Australia"] = "au"
        contryname_map["Belgium"] = "be"
        contryname_map["Brazil"] = "br"
        contryname_map["China"] = "cn"
        contryname_map["Cuba"] = "cu"
        contryname_map["France"] = "fr"
        contryname_map["Germany"] = "de"
        contryname_map["Indonesia"] = "id"
        contryname_map["Italy"] = "it"
        contryname_map["Japan"] = "jp"
        contryname_map["Mexico"] = "mx"
        contryname_map["Britain and Northern Ireland"] = "gb"
        contryname_map["Ukraine"] = "ua"
        contryname_map["South Africa"] = "za"


        var mutableset = arrayOf("India","Canada","America","Australia","Belgium","Brazil","China","Cuba","France"  his)



        recycle = findViewById(R.id.recyclead)

        var adapter = NameAdapter(this, mutableset, contryname_map)

        recycle.adapter = adapter

    }
}
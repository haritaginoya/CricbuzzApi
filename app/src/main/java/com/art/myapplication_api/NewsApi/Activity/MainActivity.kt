package com.art.myapplication_api.NewsApi.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.R

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var array = arrayOf(
            "India",
            "Canada",
            "America",
            "Australia",
            "Belgium",
            "Brazil",
            "🇨🇳" + "China",
            "Cuba",
            "France",
            "Germany",
            "Indonesia",
            "Italy",
            "Japan",
            "South Africa",
            "Ukraine",
            "Britain and Northern Ireland",
            "Mexico"
        )

        var flag = arrayOf(
            "🇮🇳",
            "🇨🇦",
            "\uD83C\uDDFA\uD83C\uDDF8",
            "\uD83C\uDDE6\uD83C\uDDFA",
            "🇧🇪",
            "\uD83C\uDDE7\uD83C\uDDF7",
            "\uD83C\uDDE8\uD83C\uDDFA",
            "\uD83C\uDDEB\uD83C\uDDF7",
            "\uD83C\uDDE9\uD83C\uDDEA",
            "\uD83C\uDDEE\uD83C\uDDE9",
            "\uD83C\uDDEE\uD83C\uDDF9",
            "\uD83C\uDDEF\uD83C\uDDF5",
            "\uD83C\uDDFF\uD83C\uDDE6",
            "\uD83C\uDDFA\uD83C\uDDE6",
            "\uD83C\uDDEE\uD83C\uDDEA",
            "\uD83C\uDDF2\uD83C\uDDFD"
        )

        recycle = findViewById(R.id.recyclead)

        var adapter = NameAdapter(this, array,flag)

        recycle.adapter = adapter

    }
}
package com.art.myapplication_api.NewsApi.Activity

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.art.myapplication_api.NewsApi.DataClass.News
import com.art.myapplication_api.NewsApi.DataClass.RetrofitInstance
import com.art.myapplication_api.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsActivity : AppCompatActivity() {
    var contryname_map = HashMap<String, String>()
    lateinit var news: RecyclerView
    lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        news = findViewById(R.id.newsrecycle)
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView)

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

        var contry_name = intent.getStringExtra("country_name")


        var newstype = arrayOf("sports", "entertainment", "business", "health")

        var adapter = ArrayAdapter(this, R.layout.first_layout, newstype)

        autoCompleteTextView.setAdapter(adapter)



        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->

            RetrofitInstance().service.response(
                contry_name!!,
                autoCompleteTextView.text.toString(),
                "ddec8867f68a4c80b097d86b1a8dd80f"
            ).enqueue(object : Callback<News> {
                override fun onResponse(call: Call<News>?, response: Response<News>?) {
                    Log.d("=======", "onResponse: ${response!!.body()}")
                }

                override fun onFailure(call: Call<News>?, t: Throwable?) {
                    Log.e("=======", "onFailure ===> : ${t!!.message}")

                }

            })
            Log.d(
                "--===", "onCreate:  ${autoCompleteTextView.text.toString()}"
            )

        }
    }
}
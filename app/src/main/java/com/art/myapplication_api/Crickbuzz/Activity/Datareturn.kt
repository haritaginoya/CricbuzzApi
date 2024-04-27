package com.art.myapplication_api.Crickbuzz.Activity

import android.content.Context
import android.util.Log
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.art.myapplication_api.Crickbuzz.DataClasses.MyData
import com.google.gson.Gson

class Datareturn(var context : Context) {


    fun getdata(callback : (MyData)->Unit)
    {
        var ss : MyData
        var que = Volley.newRequestQueue(context)
        var url = "https://cricbuzz-cricket.p.rapidapi.com/matches/v1/recent"
        var request = object : StringRequest(Method.GET, url, {

             ss  = Gson().fromJson(it, MyData::class.java)
            callback.invoke(ss)

            Log.d("--==", "getdata: ${ss}")
        }, {

            Log.e("volley error", "onCreate: ${it.localizedMessage}")
        }) {


            override fun getHeaders(): MutableMap<String, String> {

                var map = HashMap<String, String>()
                map["X-RapidAPI-Key"] = "dd65bd5d13msha5f9706e769d21fp15e4a4jsnc81a4dca5f4a"
                map["X-RapidAPI-Host"] = "cricbuzz-cricket.p.rapidapi.com"

                return map
            }
        }


        que.add(request)

    }

}
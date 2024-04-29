package com.art.myapplication_api.NewsApi.DataClass

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInstance {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: MyInterface = retrofit.create(MyInterface::class.java)

}
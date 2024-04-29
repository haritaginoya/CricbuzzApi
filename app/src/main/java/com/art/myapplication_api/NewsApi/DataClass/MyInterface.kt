package com.art.myapplication_api.NewsApi.DataClass

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MyInterface {
//    @GET("/v2/everything")
    @GET("/v2/top-headlines")
    fun response(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Call<News>
}
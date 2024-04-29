package com.art.myapplication_api.NewsApi.DataClass

import com.google.gson.annotations.SerializedName


data class News (

  @SerializedName("status"       ) var status       : String?             = null,
  @SerializedName("totalResults" ) var totalResults : Int?                = null,
  @SerializedName("articles"     ) var articles     : ArrayList<Articles> = arrayListOf()

)
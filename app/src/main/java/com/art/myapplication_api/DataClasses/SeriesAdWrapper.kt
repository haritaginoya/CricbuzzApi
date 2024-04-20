package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class SeriesAdWrapper (

  @SerializedName("seriesId"   ) var seriesId   : Int?               = null,
  @SerializedName("seriesName" ) var seriesName : String?            = null,
  @SerializedName("matches"    ) var matches    : ArrayList<Matches> = arrayListOf()

)
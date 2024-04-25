package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class TypeMatches (

  @SerializedName("matchType"     ) var matchType     : String?                  = null,
  @SerializedName("seriesMatches" ) var seriesMatches : ArrayList<SeriesMatches> = arrayListOf()

): Serializable
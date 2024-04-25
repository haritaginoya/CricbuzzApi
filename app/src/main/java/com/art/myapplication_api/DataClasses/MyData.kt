package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MyData (

  @SerializedName("typeMatches"         ) var typeMatches         : ArrayList<TypeMatches> = arrayListOf(),
  @SerializedName("filters"             ) var filters             : Filters?               = Filters(),
  @SerializedName("appIndex"            ) var appIndex            : AppIndex?              = AppIndex(),
  @SerializedName("responseLastUpdated" ) var responseLastUpdated : String?                = null

): Serializable
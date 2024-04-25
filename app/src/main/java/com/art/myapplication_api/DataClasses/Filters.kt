package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Filters (

  @SerializedName("matchType" ) var matchType : ArrayList<String> = arrayListOf()

): Serializable
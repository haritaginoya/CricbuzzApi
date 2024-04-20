package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class Filters (

  @SerializedName("matchType" ) var matchType : ArrayList<String> = arrayListOf()

)
package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class AppIndex (

  @SerializedName("seoTitle" ) var seoTitle : String? = null,
  @SerializedName("webURL"   ) var webURL   : String? = null

)
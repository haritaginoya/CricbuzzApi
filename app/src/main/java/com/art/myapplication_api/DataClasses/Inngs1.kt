package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class Inngs1 (

  @SerializedName("inningsId" ) var inningsId : Int?    = null,
  @SerializedName("runs"      ) var runs      : Int?    = null,
  @SerializedName("wickets"   ) var wickets   : Int?    = null,
  @SerializedName("overs"     ) var overs     : Double? = null

)
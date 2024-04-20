package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class Team2 (

  @SerializedName("teamId"    ) var teamId    : Int?    = null,
  @SerializedName("teamName"  ) var teamName  : String? = null,
  @SerializedName("teamSName" ) var teamSName : String? = null,
  @SerializedName("imageId"   ) var imageId   : Int?    = null

)
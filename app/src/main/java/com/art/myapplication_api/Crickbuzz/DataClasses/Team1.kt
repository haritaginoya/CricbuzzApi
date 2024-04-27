package com.art.myapplication_api.Crickbuzz.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Team1 (

  @SerializedName("teamId"    ) var teamId    : Int?    = null,
  @SerializedName("teamName"  ) var teamName  : String? = null,
  @SerializedName("teamSName" ) var teamSName : String? = null,
  @SerializedName("imageId"   ) var imageId   : Int?    = null

): Serializable
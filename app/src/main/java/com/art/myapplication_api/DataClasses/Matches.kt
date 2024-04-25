package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Matches (

  @SerializedName("matchInfo"  ) var matchInfo  : MatchInfo?  = MatchInfo(),
  @SerializedName("matchScore" ) var matchScore : MatchScore? = MatchScore()

): Serializable
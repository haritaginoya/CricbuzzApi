package com.art.myapplication_api.Crickbuzz.DataClasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MatchScore (

  @SerializedName("team1Score" ) var team1Score : Team1Score? = Team1Score()

): Serializable
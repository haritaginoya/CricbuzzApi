package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class MatchScore (

  @SerializedName("team1Score" ) var team1Score : Team1Score? = Team1Score()

)
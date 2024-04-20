package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class SeriesMatches (

  @SerializedName("seriesAdWrapper" ) var seriesAdWrapper : SeriesAdWrapper? = SeriesAdWrapper()

)
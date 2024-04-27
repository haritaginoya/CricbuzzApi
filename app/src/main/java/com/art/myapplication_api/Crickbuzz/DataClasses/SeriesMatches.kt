package com.art.myapplication_api.Crickbuzz.DataClasses

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class SeriesMatches(

  @SerializedName("seriesAdWrapper") var seriesAdWrapper: SeriesAdWrapper? = SeriesAdWrapper()

) : Serializable

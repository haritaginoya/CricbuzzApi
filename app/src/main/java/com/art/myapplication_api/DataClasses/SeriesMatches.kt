package com.art.myapplication_api.DataClasses

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class SeriesMatches(

  @SerializedName("seriesAdWrapper") var seriesAdWrapper: SeriesAdWrapper? = SeriesAdWrapper()

) : Parcelable {
  constructor(parcel: Parcel) : this(
    parcel.readValue()
  )

  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeValue(this.seriesAdWrapper)
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<SeriesMatches> {
    override fun createFromParcel(parcel: Parcel): SeriesMatches {
      return SeriesMatches(parcel)
    }

    override fun newArray(size: Int): Array<SeriesMatches?> {
      return arrayOfNulls(size)
    }
  }
}

private fun Parcel.readValue(): Any? {
  TODO("Not yet implemented")
}

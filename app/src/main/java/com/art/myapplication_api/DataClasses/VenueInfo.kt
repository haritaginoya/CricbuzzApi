package com.art.myapplication_api.DataClasses

import com.google.gson.annotations.SerializedName


data class VenueInfo (

  @SerializedName("id"        ) var id        : Int?    = null,
  @SerializedName("ground"    ) var ground    : String? = null,
  @SerializedName("city"      ) var city      : String? = null,
  @SerializedName("timezone"  ) var timezone  : String? = null,
  @SerializedName("latitude"  ) var latitude  : String? = null,
  @SerializedName("longitude" ) var longitude : String? = null

)
package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TLocation(
		@SerializedName("longitude") val longitude: Float,
		@SerializedName("latitude") val latitude: Float
)
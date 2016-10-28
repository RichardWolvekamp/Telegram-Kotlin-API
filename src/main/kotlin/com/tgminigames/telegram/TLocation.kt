package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TLocation(
		@SerializedName("longitude") val longitude: Float,
		@SerializedName("latitude") val latitude: Float
)
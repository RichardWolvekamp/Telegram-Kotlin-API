package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TVenue(
		@SerializedName("location") val location: TLocation,
		@SerializedName("title") val title: String,
		@SerializedName("address") val address: String,
		@SerializedName("foursquare_id") val foursquare_id: String?
)
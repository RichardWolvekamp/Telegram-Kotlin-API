package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInputVenueMessageContent(
		@SerializedName("latitude") val latitude: Float,
		@SerializedName("longitude") val longitude: Float,
		@SerializedName("title") val title: String,
		@SerializedName("address") val address: String,
		@SerializedName("foursquare_id") val foursquare_id: String?
) : TInputMessageContent
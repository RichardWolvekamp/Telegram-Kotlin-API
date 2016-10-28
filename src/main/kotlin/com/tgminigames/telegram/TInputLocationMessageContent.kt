package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInputLocationMessageContent(
		@SerializedName("latitude") val latitude: Float,
		@SerializedName("longitude") val longitude: Float
) : TInputMessageContent
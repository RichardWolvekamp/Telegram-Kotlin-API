package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TKeyboardButton(
		@SerializedName("text") val text: String,
		@SerializedName("request_contact") val request_contact: Boolean?,
		@SerializedName("request_location") val request_location: Boolean?
)
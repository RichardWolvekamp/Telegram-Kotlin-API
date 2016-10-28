package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TContact(
		@SerializedName("phone_number") val phone_number: String,
		@SerializedName("first_name") val first_name: String,
		@SerializedName("last_name") val last_name: String?,
		@SerializedName("user_id") val user_id: Int?
)
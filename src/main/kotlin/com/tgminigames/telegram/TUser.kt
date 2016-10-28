package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TUser(
		@SerializedName("id") val id: Long,
		@SerializedName("first_name") val first_name: String,
		@SerializedName("last_name") val last_name: String?,
		@SerializedName("username") val username: String?
)
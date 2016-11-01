package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TChat(
		@SerializedName("id") val id: Long,
		@SerializedName("type") val type: String,
		@SerializedName("title") val title: String?,
		@SerializedName("username") val username: String?,
		@SerializedName("first_name") val first_name: String?,
		@SerializedName("last_name") val last_name: String?,
		@SerializedName("all_members_are_administrators") val all_members_are_administrators: Boolean?
)
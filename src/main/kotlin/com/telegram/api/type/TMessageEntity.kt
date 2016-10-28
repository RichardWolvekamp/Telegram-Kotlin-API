package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TMessageEntity(
		@SerializedName("type") val type: String,
		@SerializedName("offset") val offset: Int,
		@SerializedName("length") val length: Int,
		@SerializedName("url") val url: String?,
		@SerializedName("user") val user: TUser?
)
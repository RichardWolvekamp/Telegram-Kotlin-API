package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineQuery(
		@SerializedName("id") val id: String,
		@SerializedName("from") val from: TUser,
		@SerializedName("location") val location: TLocation?,
		@SerializedName("query") val query: String,
		@SerializedName("offset") val offset: String
)
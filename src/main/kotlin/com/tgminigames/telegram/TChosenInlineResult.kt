package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TChosenInlineResult(
		@SerializedName("result_id") val result_id: String,
		@SerializedName("from") val from: TUser,
		@SerializedName("location") val location: TLocation?,
		@SerializedName("inline_message_id") val inline_message_id: String?,
		@SerializedName("query") val query: String
)
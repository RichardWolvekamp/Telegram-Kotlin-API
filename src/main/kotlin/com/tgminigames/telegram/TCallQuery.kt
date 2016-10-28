package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TCallQuery(
		@SerializedName("id") val id: String,
		@SerializedName("from") val from: TUser,
		@SerializedName("message") val message: TMessage?,
		@SerializedName("inline_message_id") val inline_message_id: String?,
		@SerializedName("data") val data: String
)

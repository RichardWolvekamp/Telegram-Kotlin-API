package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineKeyboardButton(
		@SerializedName("text") val text: String,
		@SerializedName("url") val url: String?,
		@SerializedName("callback_data") val callback_data: String?,
		@SerializedName("switch_inline_query") val switch_inline_query: String?
)
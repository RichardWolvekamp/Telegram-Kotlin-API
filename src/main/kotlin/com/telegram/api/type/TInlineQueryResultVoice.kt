package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultVoice(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("voice_url") val voice_url: String,
		@SerializedName("title") val title: String,
		@SerializedName("voice_duration") val voice_duration: Int?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultAudio(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("audio_url") val audio_url: String,
		@SerializedName("title") val title: String,
		@SerializedName("performer") val performer: String?,
		@SerializedName("audio_duration") val audio_duration: Int?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
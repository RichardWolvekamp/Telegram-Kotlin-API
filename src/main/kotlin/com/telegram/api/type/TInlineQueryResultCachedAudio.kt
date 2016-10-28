package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultCachedAudio(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("audio_file_id") val audio_file_id: String,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
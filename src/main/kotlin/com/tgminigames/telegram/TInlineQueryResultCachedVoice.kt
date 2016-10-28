package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultCachedVoice(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("voice_file_id") val voice_file_id: String,
		@SerializedName("title") val title: String,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultCachedVideo(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("video_file_id") val video_file_id: String,
		@SerializedName("title") val title: String,
		@SerializedName("description") val description: String?,
		@SerializedName("caption") val caption: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
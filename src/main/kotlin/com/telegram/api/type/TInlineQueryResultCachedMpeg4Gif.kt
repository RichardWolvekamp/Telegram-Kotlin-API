package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultCachedMpeg4Gif(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("mpeg4_file_id") val mpeg4_file_id: String,
		@SerializedName("title") val title: String?,
		@SerializedName("caption") val caption: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
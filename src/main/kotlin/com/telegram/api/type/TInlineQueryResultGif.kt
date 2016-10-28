package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultGif(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("gif_url") val gif_url: String,
		@SerializedName("gif_width") val gif_width: Int?,
		@SerializedName("gif_height") val gif_height: Int?,
		@SerializedName("thumb_url") val thumb_url: String,
		@SerializedName("title") val title: String?,
		@SerializedName("caption") val caption: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
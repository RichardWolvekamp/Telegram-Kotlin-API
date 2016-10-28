package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultMpeg4Gif(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("mpeg4_url") val mpeg4_url: String,
		@SerializedName("mpeg4_width") val mpeg4_width: Int?,
		@SerializedName("mpeg4_height") val mpeg4_height: Int?,
		@SerializedName("thumb_url") val thumb_url: String,
		@SerializedName("title") val title: String?,
		@SerializedName("caption") val caption: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
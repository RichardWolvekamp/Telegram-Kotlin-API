package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultPhoto(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("photo_url") val photo_url: String,
		@SerializedName("thumb_url") val thumb_url: String,
		@SerializedName("photo_width") val photo_width: Int?,
		@SerializedName("photo_height") val photo_height: Int?,
		@SerializedName("title") val title: String?,
		@SerializedName("description") val description: String?,
		@SerializedName("caption") val caption: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultVideo(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("video_url") val video_url: String,
		@SerializedName("mime_type") val mime_type: String,
		@SerializedName("thumb_url") val thumb_url: String,
		@SerializedName("title") val title: String,
		@SerializedName("caption") val caption: String?,
		@SerializedName("video_width") val video_width: Int?,
		@SerializedName("video_height") val video_height: Int?,
		@SerializedName("video_duration") val video_duration: Int?,
		@SerializedName("description") val description: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?
) : TInlineQueryResult
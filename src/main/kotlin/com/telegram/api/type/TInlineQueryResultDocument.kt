package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultDocument(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("title") val title: String,
		@SerializedName("caption") val caption: String?,
		@SerializedName("document_url") val document_url: String,
		@SerializedName("mime_type") val mime_type: String,
		@SerializedName("description") val description: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?,
		@SerializedName("thumb_url") val thumb_url: String?,
		@SerializedName("thumb_width") val thumb_width: Int?,
		@SerializedName("thumb_height") val thumb_height: Int?
) : TInlineQueryResult
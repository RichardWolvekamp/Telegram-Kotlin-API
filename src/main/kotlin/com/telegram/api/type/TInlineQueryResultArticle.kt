package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultArticle(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("title") val title: String,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup? = null,
		@SerializedName("url") val url: String? = null,
		@SerializedName("hide_url") val hide_url: Boolean? = null,
		@SerializedName("description") val description: String? = null,
		@SerializedName("thumb_url") val thumb_url: String? = null,
		@SerializedName("thumb_width") val thumb_width: Int? = null,
		@SerializedName("thumb_height") val thumb_height: Int? = null
) : TInlineQueryResult
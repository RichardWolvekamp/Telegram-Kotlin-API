package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultContact(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("phone_number") val phone_number: String,
		@SerializedName("first_name") val first_name: String,
		@SerializedName("last_name") val last_name: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?,
		@SerializedName("thumb_url") val thumb_url: String?,
		@SerializedName("thumb_width") val thumb_width: Int?,
		@SerializedName("thumb_height") val thumb_height: Int?
) : TInlineQueryResult
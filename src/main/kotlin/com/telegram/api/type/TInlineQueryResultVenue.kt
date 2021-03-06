package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineQueryResultVenue(
		@SerializedName("type") val type: String,
		@SerializedName("id") val id: String,
		@SerializedName("latitude") val latitude: Float,
		@SerializedName("longitude") val longitude: Float,
		@SerializedName("title") val title: String,
		@SerializedName("address") val address: String,
		@SerializedName("foursquare_id") val foursquare_id: String?,
		@SerializedName("reply_markup") val reply_markup: TInlineKeyboardMarkup?,
		@SerializedName("input_message_content") val input_message_content: TInputMessageContent?,
		@SerializedName("thumb_url") val thumb_url: String?,
		@SerializedName("thumb_width") val thumb_width: Int?,
		@SerializedName("thumb_height") val thumb_height: Int?
) : TInlineQueryResult
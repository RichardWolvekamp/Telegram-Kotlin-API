package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TReplyKeyboardMarkup(
		@SerializedName("keyboard") val keyboard: Array<TKeyboardButton>,
		@SerializedName("resize_keyboard") val resize_keyboard: Boolean?,
		@SerializedName("one_time_keyboard") val one_time_keyboard: Boolean?,
		@SerializedName("selective") val selective: Boolean?
) : TReplyMarkup
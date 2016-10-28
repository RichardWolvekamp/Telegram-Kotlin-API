package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TReplyKeyboardHide(
		@SerializedName("hide_keyboard") val hide_keyboard: Boolean,
		@SerializedName("selective") val selective: Boolean?
) : TReplyMarkup
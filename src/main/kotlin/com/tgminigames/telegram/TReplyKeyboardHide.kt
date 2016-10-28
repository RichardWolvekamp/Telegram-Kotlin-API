package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TReplyKeyboardHide(
		@SerializedName("hide_keyboard") val hide_keyboard: Boolean,
		@SerializedName("selective") val selective: Boolean?
) : TReplyMarkup
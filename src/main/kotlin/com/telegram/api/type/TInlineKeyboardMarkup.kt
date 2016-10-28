package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInlineKeyboardMarkup(
		@SerializedName("inline_keyboard") val inline_keyboard: Array<TInlineKeyboardButton>
) : TReplyMarkup
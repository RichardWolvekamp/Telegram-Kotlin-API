package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TUpdate(
		@SerializedName("update_id") val update_id: Long,
		@SerializedName("message") val message: TMessage,
		@SerializedName("edited_message") val edited_message: TMessage,
		@SerializedName("inline_query") val inline_query: TInlineQuery,
		@SerializedName("chosen_inline_result") val chosen_inline_result: TChosenInlineResult,
		@SerializedName("callback_query") val callback_query: TCallbackQuery
)
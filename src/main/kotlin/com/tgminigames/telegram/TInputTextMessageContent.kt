package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TInputTextMessageContent(
		@SerializedName("message_text") val message_text: String,
		@SerializedName("parse_mode") val parse_mode: String?,
		@SerializedName("disable_web_page_preview") val disable_web_page_preview: Boolean?
) : TInputMessageContent
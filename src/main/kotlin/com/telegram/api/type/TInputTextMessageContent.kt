package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TInputTextMessageContent(
		@SerializedName("message_text") val message_text: String,
		@SerializedName("parse_mode") val parse_mode: String? = null,
		@SerializedName("disable_web_page_preview") val disable_web_page_preview: Boolean? = null
) : TInputMessageContent
package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TWebhookInfo(
		@SerializedName("url") val url: String,
		@SerializedName("has_custom_certificate") val has_custom_certificate: Boolean,
		@SerializedName("pending_update_count") val pending_update_count: Int,
		@SerializedName("last_error_date") val last_error_date: Int?,
		@SerializedName("last_error_message") val last_error_message: String?
)
package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName


data class TResponse<T>(
		@SerializedName("ok") val ok: Boolean,
		@SerializedName("result") val result: T?,
		@SerializedName("error_code") val error_code: Int?,
		@SerializedName("description") val description: String?
)
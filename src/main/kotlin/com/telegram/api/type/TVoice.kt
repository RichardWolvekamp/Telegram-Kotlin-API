package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TVoice(
		@SerializedName("file_id") val file_id: String,
		@SerializedName("duration") val duration: Int,
		@SerializedName("mime_type") val mime_type: String?,
		@SerializedName("file_size") val file_size: Int?
)
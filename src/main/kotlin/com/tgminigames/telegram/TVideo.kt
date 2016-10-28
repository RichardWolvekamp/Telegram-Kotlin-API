package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TVideo(
		@SerializedName("file_id") val file_id: String,
		@SerializedName("width") val width: Int,
		@SerializedName("height") val height: Int,
		@SerializedName("duration") val duration: Int,
		@SerializedName("thume") val thumb: TPhotoSize?,
		@SerializedName("mime_type") val mime_type: String?,
		@SerializedName("file_size") val file_size: Int?
)
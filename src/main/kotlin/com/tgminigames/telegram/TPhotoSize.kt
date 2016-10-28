package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TPhotoSize(
		@SerializedName("file_id") val file_id: String,
		@SerializedName("width") val width: Int,
		@SerializedName("height") val height: Int,
		@SerializedName("file_size") val file_size: Int?
)
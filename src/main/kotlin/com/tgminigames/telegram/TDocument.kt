package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TDocument(
		@SerializedName("file_id") val file_id: String,
		@SerializedName("thumb") val thumb: TPhotoSize?,
		@SerializedName("file_name") val file_name: String?,
		@SerializedName("mime_type") val mime_type: String?,
		@SerializedName("file_size") val file_size: Int?
)
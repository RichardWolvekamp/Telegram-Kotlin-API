package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TFile(
		@SerializedName("file_id") val file_id: String,
		@SerializedName("file_size") val file_size: Int?,
		@SerializedName("file_path") val file_path: String?
)
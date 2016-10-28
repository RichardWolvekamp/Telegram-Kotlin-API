package com.tgminigames.telegram;

import com.google.gson.annotations.SerializedName

data class TUserProfilePhotos(
		@SerializedName("total_count") val total_count: Int,
		@SerializedName("photos") val photos: Array<TPhotoSize>
)
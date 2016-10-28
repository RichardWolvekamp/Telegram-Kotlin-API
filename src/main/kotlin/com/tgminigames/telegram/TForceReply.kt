package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TForceReply(
		@SerializedName("force_reply") val force_reply: Boolean,
		@SerializedName("selective") val selective: Boolean?
) : TReplyMarkup
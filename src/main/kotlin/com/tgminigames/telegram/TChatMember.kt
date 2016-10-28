package com.tgminigames.telegram

import com.google.gson.annotations.SerializedName

data class TChatMember(
		@SerializedName("user") val user: TUser,
		@SerializedName("status") val status: String
)
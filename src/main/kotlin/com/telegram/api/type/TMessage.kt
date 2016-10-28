package com.telegram.api.type

import com.google.gson.annotations.SerializedName

data class TMessage(
		@SerializedName("message_id") val message_id: Long,
		@SerializedName("from") val from: TUser?,
		@SerializedName("date") val date: Long,
		@SerializedName("chat") val chat: TChat,
		@SerializedName("forward_from") val forward_from: TUser?,
		@SerializedName("forward_from_chat") val forward_from_chat: TChat?,
		@SerializedName("forward_date") val forward_date: Long?,
		@SerializedName("reply_to_message") val reply_to_message: TMessage?,
		@SerializedName("edit_date") val edit_date: Int?,
		@SerializedName("text") val text: String?,
		@SerializedName("entities") val entities: Array<TMessageEntity>?,
		@SerializedName("audio") val audio: TAudio?,
		@SerializedName("document") val document: TDocument?,
		@SerializedName("photo") val photo: Array<TPhotoSize>?,
		@SerializedName("sticker") val sticker: TSticker?,
		@SerializedName("video") val video: TVideo?,
		@SerializedName("voice") val voice: TVoice?,
		@SerializedName("caption") val caption: String,
		@SerializedName("contact") val contact: TContact?,
		@SerializedName("location") val location: TLocation?,
		@SerializedName("venue") val venue: TVenue?,
		@SerializedName("new_chat_member") val new_chat_member: TUser?,
		@SerializedName("left_chat_member") val left_chat_member: TUser?,
		@SerializedName("new_chat_title") val new_chat_title: String?,
		@SerializedName("new_chat_photo") val new_chat_photo: Array<TPhotoSize>?,
		@SerializedName("delete_chat_photo") val delete_chat_photo: Boolean?,
		@SerializedName("group_chat_created") val group_chat_created: Boolean?,
		@SerializedName("supergroup_chat_created") val supergroup_chat_created: Boolean?,
		@SerializedName("channel_chat_created") val channel_chat_created: Boolean?,
		@SerializedName("migrate_to_chat_id") val migrate_to_chat_id: Long?,
		@SerializedName("migrate_from_chat_id") val migrate_from_chat_id: Long?,
		@SerializedName("pinned_message") val pinned_message: TMessage?
)
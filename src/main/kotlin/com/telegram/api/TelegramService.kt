package com.telegram.api

import com.telegram.api.type.*
import retrofit2.Call
import retrofit2.http.*

interface TelegramService {
	@POST("getUpdates") @FormUrlEncoded
	fun getUpdates(
			@Field("offset") offset: Long?,
			@Field("limit") limit: Int?,
			@Field("timeout") timeout: Int?
	): Call<TResponse<Array<TUpdate>>>

	@POST("setWebhook") @Multipart
	fun setWebhook(
			@Field("url") url: String?,
			@Field("certificate") certificate: TInputFile
	)

	@GET("getMe")
	fun getMe(): Call<TResponse<TUser>>

	@POST("sendMessage") @FormUrlEncoded
	fun sendMessage(
			@Field("chat_id") chat_id: String,
			@Field("text") text: String,
			@Field("parse_mode") parse_mode: String?,
			@Field("disable_web_page_preview") disable_web_page_preview: Boolean?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Boolean?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("forwardMessage") @FormUrlEncoded
	fun forwardMessage(
			@Field("chat_id") chat_id: String,
			@Field("from_chat_id") from_chat_id: String,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("message_id") message_id: Long
	): Call<TResponse<TMessage>>

	@POST("sendPhoto") @Multipart
	fun sendPhoto(
			@Field("chat_id") chat_id: String,
			@Field("photo") photo: TInputFile,
			@Field("caption") caption: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendAudio") @Multipart
	fun sendAudio(
			@Field("chat_id") chat_id: String,
			@Field("audio") audio: TInputFile,
			@Field("duration") duration: Int?,
			@Field("performer") performer: String?,
			@Field("title") title: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendDocument") @Multipart
	fun sendDocument(
			@Field("chat_id") chat_id: String,
			@Field("document") document: TInputFile,
			@Field("caption") caption: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendSticker") @Multipart
	fun sendSticker(
			@Field("chat_id") chat_id: String,
			@Field("sticker") sticker: TInputFile,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendSticker") @Multipart
	fun sendSticker(
			@Field("chat_id") chat_id: String,
			@Field("sticker") sticker: String,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendVideo") @Multipart
	fun sendVideo(
			@Field("chat_id") chat_id: String,
			@Field("video") video: TInputFile,
			@Field("duration") duration: Int?,
			@Field("width") width: Int?,
			@Field("height") height: Int?,
			@Field("caption") caption: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendVoice") @Multipart
	fun sendVoice(
			@Field("chat_id") chat_id: String,
			@Field("voice") voice: TInputFile,
			@Field("duration") duration: Int?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendLocation") @FormUrlEncoded
	fun sendLocation(
			@Field("chat_id") chat_id: String,
			@Field("latitude") latitude: Float,
			@Field("longitude") longitude: Float,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendVenue") @FormUrlEncoded
	fun sendVenue(
			@Field("chat_id") chat_id: String,
			@Field("latitude") latitude: Float,
			@Field("longitude") longitude: Float,
			@Field("title") title: String,
			@Field("address") address: String,
			@Field("foursquare_id") foursquare_id: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendContact") @FormUrlEncoded
	fun sendContact(
			@Field("chat_id") chat_id: String,
			@Field("phone_number") phone_number: String,
			@Field("first_name") first_name: String,
			@Field("last_name") last_name: String?,
			@Field("disable_notification") disable_notification: Boolean?,
			@Field("reply_to_message_id") reply_to_message_id: Long?,
			@Field("reply_markup") reply_markup: TReplyMarkup
	): Call<TResponse<TMessage>>

	@POST("sendChatAction") @FormUrlEncoded
	fun sendChatAction(
			@Field("chat_id") chat_id: String,
			@Field("action") action: String = "typing"
	)

	@POST("getUserProfilePhotos") @FormUrlEncoded
	fun getUserProfilePhotos(
			@Field("user_id") user_id: Long,
			@Field("offset") offset: Long,
			@Field("limit") limit: Int
	): Call<TResponse<TUserProfilePhotos>>

	@POST("getFile") @FormUrlEncoded
	fun getFile(
			@Field("file_id") file_id: String
	): Call<TResponse<TFile>>

	@POST("kickChatMember") @FormUrlEncoded
	fun kickChatMember(
			@Field("chat_id") chat_id: String,
			@Field("user_id") user_id: Long
	): Call<TResponse<Boolean>>

	@POST("leaveChat") @FormUrlEncoded
	fun leaveChat(
			@Field("chat_id") chat_id: String
	): Call<TResponse<Boolean>>

	@POST("unbanChatMember") @FormUrlEncoded
	fun unbanChatMember(
			@Field("chat_id") chat_id: String,
			@Field("user_id") user_id: Long
	): Call<TResponse<Boolean>>

	@POST("getChat") @FormUrlEncoded
	fun getChat(
			@Field("chat_id") chat_id: String
	): Call<TResponse<Boolean>>

	@POST("getChatAdministrators") @FormUrlEncoded
	fun getChatAdministators(
			@Field("chat_id") chat_id: String
	): Call<TResponse<Array<TChatMember>>>

	@POST("getChatMembersCount") @FormUrlEncoded
	fun getChatMembersCount(
			@Field("chat_id") chat_id: String
	): Call<TResponse<Int>>

	@POST("getChatMember") @FormUrlEncoded
	fun getChatMember(
			@Field("chat_id") chat_id: String,
			@Field("user_id") user_id: Long
	): Call<TResponse<TChatMember>>

	@POST("answerCallbackQuery") @FormUrlEncoded
	fun answerCallbackQuery(
			@Field("callback_query_id") callback_query_id: String,
			@Field("text") text: String?,
			@Field("show_alert") show_alert: Boolean?
	): Call<TResponse<Boolean>>
}
package com.telegram.api

import com.telegram.api.type.*
import retrofit2.Call
import retrofit2.http.*

interface TelegramService {
	@POST("getUpdates") @FormUrlEncoded
	fun getUpdates(
			@Field("offset") offset: Long? = null,
			@Field("limit") limit: Int? = null,
			@Field("timeout") timeout: Int?
	): Call<TResponse<Array<TUpdate>>>

	@POST("setWebhook") @Multipart
	fun setWebhook(
			@Field("url") url: String? = null,
			@Field("certificate") certificate: TInputFile? = null
	)

	@GET("getWebhookInfo") @FormUrlEncoded
	fun getWebhookInfo(): Call<TWebhookInfo>

	@GET("getMe")
	fun getMe(): Call<TResponse<TUser>>

	@POST("sendMessage") @FormUrlEncoded
	fun sendMessage(
			@Field("chat_id") chat_id: String,
			@Field("text") text: String,
			@Field("parse_mode") parse_mode: String? = null,
			@Field("disable_web_page_preview") disable_web_page_preview: Boolean? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Boolean? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("forwardMessage") @FormUrlEncoded
	fun forwardMessage(
			@Field("chat_id") chat_id: String,
			@Field("from_chat_id") from_chat_id: String,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("message_id") message_id: Long? = null
	): Call<TResponse<TMessage>>

	@POST("sendPhoto") @Multipart
	fun sendPhoto(
			@Field("chat_id") chat_id: String,
			@Field("photo") photo: TInputFile,
			@Field("caption") caption: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendAudio") @Multipart
	fun sendAudio(
			@Field("chat_id") chat_id: String,
			@Field("audio") audio: TInputFile,
			@Field("duration") duration: Int? = null,
			@Field("performer") performer: String? = null,
			@Field("title") title: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendDocument") @Multipart
	fun sendDocument(
			@Field("chat_id") chat_id: String,
			@Field("document") document: TInputFile,
			@Field("caption") caption: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendSticker") @Multipart
	fun sendSticker(
			@Field("chat_id") chat_id: String,
			@Field("sticker") sticker: TInputFile,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendSticker") @Multipart
	fun sendSticker(
			@Field("chat_id") chat_id: String,
			@Field("sticker") sticker: String,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendVideo") @Multipart
	fun sendVideo(
			@Field("chat_id") chat_id: String,
			@Field("video") video: TInputFile,
			@Field("duration") duration: Int? = null,
			@Field("width") width: Int? = null,
			@Field("height") height: Int? = null,
			@Field("caption") caption: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendVoice") @Multipart
	fun sendVoice(
			@Field("chat_id") chat_id: String,
			@Field("voice") voice: TInputFile,
			@Field("duration") duration: Int? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendLocation") @FormUrlEncoded
	fun sendLocation(
			@Field("chat_id") chat_id: String,
			@Field("latitude") latitude: Float,
			@Field("longitude") longitude: Float,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendVenue") @FormUrlEncoded
	fun sendVenue(
			@Field("chat_id") chat_id: String,
			@Field("latitude") latitude: Float,
			@Field("longitude") longitude: Float,
			@Field("title") title: String,
			@Field("address") address: String,
			@Field("foursquare_id") foursquare_id: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
	): Call<TResponse<TMessage>>

	@POST("sendContact") @FormUrlEncoded
	fun sendContact(
			@Field("chat_id") chat_id: String,
			@Field("phone_number") phone_number: String,
			@Field("first_name") first_name: String,
			@Field("last_name") last_name: String? = null,
			@Field("disable_notification") disable_notification: Boolean? = null,
			@Field("reply_to_message_id") reply_to_message_id: Long? = null,
			@Field("reply_markup") reply_markup: TReplyMarkup? = null
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
			@Field("text") text: String? = null,
			@Field("show_alert") show_alert: Boolean? = null
	): Call<TResponse<Boolean>>

	@POST("answerInlineQuery") @FormUrlEncoded
	fun answerInlineQuery(
			@Field("inline_query_id") inline_query_id: String,
			@Field("results") results: Array<TInlineQueryResult>,
			@Field("cache_time") cache_time: Int? = null,
			@Field("is_personal") is_personal: Boolean? = null,
			@Field("next_offset") next_offset: String? = null,
			@Field("switch_pm_text") switch_pm_text: String? = null,
			@Field("switch_pm_parameter") switch_pm_parameter: String? = null
	): Call<TResponse<Boolean>>
}
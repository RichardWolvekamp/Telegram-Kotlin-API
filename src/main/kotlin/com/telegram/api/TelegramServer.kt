package com.telegram.api

import com.telegram.api.type.TUpdate
import com.telegram.api.type.TUser
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TelegramServer(token: String) {
	private val service: TelegramService
	private val me: TUser
	private var isStarted: Boolean = false
	private var shouldStop: Boolean = false
	var handler: (TUpdate) -> Unit = {}

	init {
		val adapter = Retrofit.Builder()
				.baseUrl("https://api.telegram.org/bot$token/")
				.addConverterFactory(GsonConverterFactory.create())
				.build()

		this.service = adapter.create(TelegramService::class.java)
		this.me = this.service.getMe().execute().body().result!!
	}

	fun api(): TelegramService {
		return this.service
	}

	fun start() {
		if (this.isStarted) {
			this.shouldStop = false
			return
		}

		this.isStarted = true

		var offset: Long = 0

		while (!this.shouldStop) {
			println("Getting updates")

			val request = this.service.getUpdates(offset, 100, 60).execute()
			val updates = request.body()

			if (updates != null && updates.ok && updates.result != null) {
				if (updates.result.isNotEmpty()) {
					offset = updates.result.last().update_id + 1

					updates.result.forEach { this.handler(it) }
				}
			} else {
				if (request.code() == 409) {
					println("Disconnected by new instance")
					break
				}

				println("Response was not ok")
				println(updates)
			}
		}

		this.isStarted = false
	}

	fun stop() {
		this.shouldStop = true
	}
}
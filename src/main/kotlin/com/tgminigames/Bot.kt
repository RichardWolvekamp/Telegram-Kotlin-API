package com.tgminigames

import java.util.*

class Bot {
	private var properties: Properties
	private var server: TelegramServer

	init {
		println("Initializing bot")

		this.properties = Properties()
		this.properties.load(javaClass.getResourceAsStream("/config.properties"))

		this.server = TelegramServer(this.properties.getProperty("telegram_token"))

		println("Done!")

		println("Starting server")
		this.server.start()
	}
}
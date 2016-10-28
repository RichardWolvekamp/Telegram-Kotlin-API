package com.telegram.api.type

import okhttp3.MediaType
import okhttp3.RequestBody
import okio.BufferedSink
import java.io.File
import java.nio.file.Files

class TInputFile(val file: File, val contentType: String? = null) : RequestBody() {
	override fun contentType(): MediaType? {
		return MediaType.parse(contentType ?: Files.probeContentType(file.toPath()))
	}

	override fun contentLength(): Long {
		return file.length()
	}

	override fun writeTo(sink: BufferedSink?) {
		sink?.write(file.readBytes())
	}
}
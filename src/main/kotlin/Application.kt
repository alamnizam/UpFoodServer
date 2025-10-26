package com.codeturtle

import com.codeturtle.plugin.configureMonitoring
import com.codeturtle.plugin.configureResources
import com.codeturtle.plugin.configureRouting
import com.codeturtle.plugin.configureSecurity
import com.codeturtle.plugin.configureSerialization
import com.codeturtle.plugin.configureStatusPages
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureResources()
    configureSecurity()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureStatusPages()
}

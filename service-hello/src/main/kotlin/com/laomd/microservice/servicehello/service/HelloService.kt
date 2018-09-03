package com.laomd.microservice.servicehello.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.boot.web.context.WebServerInitializedEvent
import org.springframework.context.ApplicationListener

@Component
class MyApplicationListener : ApplicationListener<WebServerInitializedEvent> {

    final var port: Int = 0
        private set

    override fun onApplicationEvent(event: WebServerInitializedEvent) {
        this.port = event.webServer.port
    }
}

@Service
class HelloService {
    @Autowired
    val listener: MyApplicationListener? = null

    fun hello(name: String): String {
        return "Hello $name from ${listener!!.port}!"
    }
}
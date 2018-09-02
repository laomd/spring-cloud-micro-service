package com.laomd.microservice.servicehello.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class HelloService {
    @Value("\${server.port}")
    val port: Int = 0
    fun hello(name: String): String {
        return "Hello $name from $port!"
    }
}
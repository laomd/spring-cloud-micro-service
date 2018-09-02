package com.laomd.microservice.servicehello.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun hello(name: String): String {
        return "Hello $name!"
    }
}
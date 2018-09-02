package com.laomd.microservice.ribbonconsumer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class ConsumerController {
    @Autowired
    var restTemplate: RestTemplate? = null

    @GetMapping("/ribbon")
    fun helloConsumer(): String {
        return restTemplate!!.getForObject("http://SERVICE-HELLO/hello", String::class.java)!!
    }
}
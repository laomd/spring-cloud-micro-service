package com.laomd.microservice.servicehello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ServiceHelloApplication

fun main(args: Array<String>) {
    runApplication<ServiceHelloApplication>(*args)
}

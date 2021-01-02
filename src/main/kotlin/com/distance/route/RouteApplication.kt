package com.distance.route

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class RouteApplication

fun main(args: Array<String>) {
    runApplication<RouteApplication>(*args)
}

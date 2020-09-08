package com.jam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebfluxCookieSample

fun main(args: Array<String>) {
    runApplication<WebfluxCookieSample>(*args)
}
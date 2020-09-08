package com.jam.controllers

import com.jam.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/sample")
class SampleController(val sampleService: SampleService) {

    @GetMapping
    fun data(@RequestParam data: String) : Mono<String> {
        sampleService.setData(data)
        return Mono.just("Hello, $data!")
    }

}
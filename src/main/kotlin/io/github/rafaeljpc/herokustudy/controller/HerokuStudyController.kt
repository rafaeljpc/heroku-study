package io.github.rafaeljpc.herokustudy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HerokuStudyController {

    @GetMapping("/")
    fun home() = "Hello World!!!"
}
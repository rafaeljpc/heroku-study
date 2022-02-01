package io.github.rafaeljpc.herokustudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HerokuStudyApplication

fun main(args: Array<String>) {
	runApplication<HerokuStudyApplication>(*args)
}

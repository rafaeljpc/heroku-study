package io.github.rafaeljpc.herokustudy.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories
@EnableAutoConfiguration
class HerokuStudyConfiguration {
}
package io.github.rafaeljpc.herokustudy.config

import io.github.rafaeljpc.herokustudy.repository.PersonRepository
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = [PersonRepository::class])
class HerokuStudyConfiguration {
}
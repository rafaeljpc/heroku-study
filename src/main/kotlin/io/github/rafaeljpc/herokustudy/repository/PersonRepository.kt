package io.github.rafaeljpc.herokustudy.repository

import io.github.rafaeljpc.herokustudy.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long>
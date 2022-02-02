package io.github.rafaeljpc.herokustudy.controller

import io.github.rafaeljpc.herokustudy.entity.Person
import io.github.rafaeljpc.herokustudy.repository.PersonRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import javax.websocket.server.PathParam

@RestController("/")
class HerokuStudyController(
    private val personRepository: PersonRepository
) {
    @GetMapping
    fun home() = "Hello World!!"

    @PostMapping("/person")
    fun register(@RequestBody person: Person) {
        personRepository.save(person)
    }

    @PostMapping("/person/{id}")
    fun update(@PathParam("id") id: Long, @RequestBody person: Person) {
        var entity = personRepository.findById(id).orElseGet {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "person not found")
        }

        entity.name = person.name
        entity.email = person.email

        personRepository.save(person)
    }

    @GetMapping("/person")
    fun list(): List<Person> = personRepository.findAll()

    @GetMapping("/person/{id}")
    fun list(@PathParam("id") id: Long): Person = personRepository.findById(id).orElseGet {
        throw ResponseStatusException(HttpStatus.NOT_FOUND, "person not found")
    }
}
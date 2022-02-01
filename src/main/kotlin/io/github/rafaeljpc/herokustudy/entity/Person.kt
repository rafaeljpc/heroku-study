package io.github.rafaeljpc.herokustudy.entity

import javax.persistence.*

@Entity
@Table(name = "person", schema = "profile")
data class Person(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val email: String,
)
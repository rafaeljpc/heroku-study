package io.github.rafaeljpc.herokustudy.entity

import org.springframework.data.domain.Persistable
import javax.persistence.*

@Entity
@Table(name = "person", schema = "profile")
class Person(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,
    var name: String,
    var email: String,
) : Persistable<Long> {

    override fun getId(): Long? = id

    fun setId(value: Long) {
        this.id = value
    }

    override fun isNew(): Boolean = null == id
}
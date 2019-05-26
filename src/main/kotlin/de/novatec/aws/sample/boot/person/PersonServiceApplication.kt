package de.novatec.aws.sample.boot.person

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonServiceApplication

fun main(args: Array<String>) {
	runApplication<PersonServiceApplication>(*args)
}

package de.novatec.aws.sample.boot.person.data

import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long> {
}
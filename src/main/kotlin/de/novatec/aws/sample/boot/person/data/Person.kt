package de.novatec.aws.sample.boot.person.data

import org.springframework.data.annotation.Id

data class Person (@Id var id : Long, var vorname : String, var nachname : String)
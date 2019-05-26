package de.novatec.aws.sample.boot.person.api

import de.novatec.aws.sample.boot.person.data.Person
import de.novatec.aws.sample.boot.person.data.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("person")
class HelloController (val repository : PersonRepository) {

    @GetMapping("/get")
    fun getPersonList() : Iterable<Person> =  repository.findAll();

    @GetMapping("/get/{id}")
    fun getPersonById(@PathVariable("id") id : Long) : Optional<Person> =  repository.findById(id);
}
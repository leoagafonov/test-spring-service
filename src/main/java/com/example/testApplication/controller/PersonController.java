package com.example.testApplication.controller;

import com.example.testApplication.PersonService;
import com.example.testApplication.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    Person getPerson(@PathVariable Integer id) {
        return personService.findById(id).get();
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    ResponseEntity<String> postPerson(@Valid @RequestBody Person person) {
        Person savedPerson = personService.save(person);
        return ResponseEntity.ok(savedPerson.toString());
    }

    @RequestMapping(value = "/getAllPersons", method = RequestMethod.GET)
    List<Person> getAllPersons() {
        return personService.findAll();
    }
}

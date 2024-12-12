package com.brunus.projetoLeLojinha.controller.personController;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import com.brunus.projetoLeLojinha.domain.model.person.PersonRequestDTO;
import com.brunus.projetoLeLojinha.service.personService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person")
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(PersonService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody PersonRequestDTO data){
        Person person = service.createPerson(data);
        return ResponseEntity.ok(person);
    }
}

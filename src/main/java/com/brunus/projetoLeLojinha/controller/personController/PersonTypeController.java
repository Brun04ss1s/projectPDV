package com.brunus.projetoLeLojinha.controller.personController;

import com.brunus.projetoLeLojinha.domain.model.person.PersonType;
import com.brunus.projetoLeLojinha.domain.model.person.PersonTypeRequestDTO;
import com.brunus.projetoLeLojinha.service.personService.PersonTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/person_type")
public class PersonTypeController {

    private final PersonTypeService service;

    @Autowired
    public PersonTypeController(PersonTypeService service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<PersonType> create(@RequestBody PersonTypeRequestDTO data){
        PersonType person = service.createPersonType(data);
        return ResponseEntity.ok(person);
    }
}

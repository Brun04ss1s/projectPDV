package com.brunus.projetoLeLojinha.service.personService;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import com.brunus.projetoLeLojinha.domain.model.person.PersonRequestDTO;
import com.brunus.projetoLeLojinha.domain.model.person.PersonType;
import com.brunus.projetoLeLojinha.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PersonService {

    private final PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public Person createPerson(PersonRequestDTO data){

        //Pegando o tipo da pessoa
        PersonType personType = new PersonType();
        personType.setId(data.typeId().intValue());

        //Gerando a pessoa
        Person person = new Person();
        person.setName(data.name());
        person.setCpf(data.cpf());
        person.setPersonType(personType);
        return repository.save(person);
    }
}

package com.brunus.projetoLeLojinha.service.personService;

import com.brunus.projetoLeLojinha.domain.model.person.PersonType;
import com.brunus.projetoLeLojinha.domain.model.person.PersonTypeRequestDTO;
import com.brunus.projetoLeLojinha.repository.PersonTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonTypeService {

    private final PersonTypeRepository repository;

    @Autowired
    public PersonTypeService(PersonTypeRepository repository){
        this.repository = repository;
    }

    public PersonType createPersonType (PersonTypeRequestDTO data){
        PersonType personType = new PersonType();
        personType.setDescription(data.description());
        return repository.save(personType);
    }
}

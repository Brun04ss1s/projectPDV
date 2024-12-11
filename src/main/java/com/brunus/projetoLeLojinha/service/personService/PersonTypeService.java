package com.brunus.projetoLeLojinha.service.personService;

import com.brunus.projetoLeLojinha.domain.model.person.PersonType;
import com.brunus.projetoLeLojinha.domain.model.person.PersonTypeRequestDTO;
import org.springframework.stereotype.Service;

@Service

public class PersonTypeService {
    public PersonType createPersonType (PersonTypeRequestDTO data){

        PersonType personType = new PersonType();
        personType.setDescription(data.description());
        return personType;
    }
}

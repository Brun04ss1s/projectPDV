package com.brunus.projetoLeLojinha.repository;

import com.brunus.projetoLeLojinha.domain.model.person.PersonType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonTypeRepository extends JpaRepository<PersonType,Integer> {
}

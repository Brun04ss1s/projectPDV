package com.brunus.projetoLeLojinha.repository;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

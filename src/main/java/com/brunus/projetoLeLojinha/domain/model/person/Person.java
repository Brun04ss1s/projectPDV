package com.brunus.projetoLeLojinha.domain.model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="physical_person")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Person {

    @Id
    @GeneratedValue
    private String personId;

    private String name;
    private String cpf;
    private Integer typeId;

}

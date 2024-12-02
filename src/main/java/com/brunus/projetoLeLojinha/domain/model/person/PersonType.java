package com.brunus.projetoLeLojinha.domain.model.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person_type")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PersonType {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;
}

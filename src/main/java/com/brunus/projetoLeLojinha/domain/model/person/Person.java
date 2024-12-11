package com.brunus.projetoLeLojinha.domain.model.person;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;

    private String name;
    private String cpf;
    private Integer typeId;

}

package com.brunus.projetoLeLojinha.domain.model.product;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "product")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private Integer price;
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;
}

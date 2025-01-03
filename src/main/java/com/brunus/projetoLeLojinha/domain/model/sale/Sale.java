package com.brunus.projetoLeLojinha.domain.model.sale;

import com.brunus.projetoLeLojinha.domain.model.person.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name="sale")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Sale {

    @Id
    @GeneratedValue
    private UUID saleId;

    private Date saleDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

}

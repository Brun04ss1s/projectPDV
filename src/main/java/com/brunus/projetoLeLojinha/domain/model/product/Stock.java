package com.brunus.projetoLeLojinha.domain.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "stock")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date lastUpdate;
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

package com.brunus.projetoLeLojinha.domain.model.product;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

    private Date lastUpdate;
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

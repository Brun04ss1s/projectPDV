package com.brunus.projetoLeLojinha.domain.model.sale;

import com.brunus.projetoLeLojinha.domain.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sale_item")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SaleItem {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

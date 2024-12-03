package com.brunus.projetoLeLojinha.repository;

import com.brunus.projetoLeLojinha.domain.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}

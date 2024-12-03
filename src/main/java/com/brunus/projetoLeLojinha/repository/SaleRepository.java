package com.brunus.projetoLeLojinha.repository;

import com.brunus.projetoLeLojinha.domain.model.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, UUID> {
}

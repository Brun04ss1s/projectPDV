package com.brunus.projetoLeLojinha.repository;

import com.brunus.projetoLeLojinha.domain.model.sale.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem,Integer> {
}

package com.erpcontrole.erp.repository;

import com.erpcontrole.erp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
package com.renanlopes.rlvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanlopes.rlvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

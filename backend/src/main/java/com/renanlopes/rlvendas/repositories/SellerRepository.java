package com.renanlopes.rlvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanlopes.rlvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

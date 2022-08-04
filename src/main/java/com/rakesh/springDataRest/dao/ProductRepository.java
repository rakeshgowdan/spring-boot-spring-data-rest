package com.rakesh.springDataRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.springDataRest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

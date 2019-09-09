package com.deepak.restws.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.restws.Entities.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}

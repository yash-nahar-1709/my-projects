package com.crudop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

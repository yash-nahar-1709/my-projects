package com.crudop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudop.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

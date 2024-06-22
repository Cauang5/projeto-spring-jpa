package com.compass.Curso_udemy.repositories;


import com.compass.Curso_udemy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

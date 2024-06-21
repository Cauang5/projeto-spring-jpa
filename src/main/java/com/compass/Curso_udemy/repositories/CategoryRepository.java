package com.compass.Curso_udemy.repositories;

import com.compass.Curso_udemy.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

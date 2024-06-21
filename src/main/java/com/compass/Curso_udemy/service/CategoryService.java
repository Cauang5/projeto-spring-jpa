package com.compass.Curso_udemy.service;

import com.compass.Curso_udemy.entities.Category;
import com.compass.Curso_udemy.entities.Order;
import com.compass.Curso_udemy.repositories.CategoryRepository;
import com.compass.Curso_udemy.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

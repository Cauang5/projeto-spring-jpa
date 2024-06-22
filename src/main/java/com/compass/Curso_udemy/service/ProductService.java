package com.compass.Curso_udemy.service;

import com.compass.Curso_udemy.entities.Category;
import com.compass.Curso_udemy.entities.Product;
import com.compass.Curso_udemy.repositories.CategoryRepository;
import com.compass.Curso_udemy.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

package com.compass.Curso_udemy.repositories;

import com.compass.Curso_udemy.entities.Order;
import com.compass.Curso_udemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.compass.Curso_udemy.repositories;

import com.compass.Curso_udemy.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

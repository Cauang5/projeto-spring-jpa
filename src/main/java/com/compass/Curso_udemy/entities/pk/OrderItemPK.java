package com.compass.Curso_udemy.entities.pk;

import com.compass.Curso_udemy.entities.Order;
import com.compass.Curso_udemy.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    @EqualsAndHashCode.Include
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @EqualsAndHashCode.Include
    private Product product;
}

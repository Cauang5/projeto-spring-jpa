package com.compass.Curso_udemy.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "tb_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;
}

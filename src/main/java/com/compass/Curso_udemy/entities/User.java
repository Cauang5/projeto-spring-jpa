package com.compass.Curso_udemy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Table (name = "tb_users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Getter
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String password;

    @JsonIgnore
    @Getter
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

    public User(Long id, String name, String email, String phone, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
             this.phone = phone;
             this.password = password;
             }

             }

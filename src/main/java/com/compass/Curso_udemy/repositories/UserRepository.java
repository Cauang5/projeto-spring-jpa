package com.compass.Curso_udemy.repositories;

import com.compass.Curso_udemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

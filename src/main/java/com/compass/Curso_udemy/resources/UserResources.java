package com.compass.Curso_udemy.resources;

import com.compass.Curso_udemy.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Bob", "Bob@gmail.com", "1235579", "1234");
        return ResponseEntity.ok().body(u);
    }
}

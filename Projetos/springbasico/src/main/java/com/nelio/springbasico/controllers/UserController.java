package com.nelio.springbasico.controllers;

import com.nelio.springbasico.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/all")
public class UserController {
    @GetMapping
    public ResponseEntity<User> find(){
        User user = new User(2L, "Juao", "Juao@", "111", "123456");
        return ResponseEntity.ok().body(user);
    }
}

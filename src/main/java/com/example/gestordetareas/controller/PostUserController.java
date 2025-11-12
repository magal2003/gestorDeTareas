package com.example.gestordetareas.controller;

import com.example.gestordetareas.model.User;
import com.example.gestordetareas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class PostUserController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping
    public ResponseEntity/*Es una clase que devuelve toda la respuesta http*/<User> CrearUsuario(@RequestBody User user) {
        User nuevo=userRepo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

}
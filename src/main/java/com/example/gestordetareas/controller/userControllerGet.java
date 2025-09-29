package com.example.gestordetareas.controller;

import com.example.gestordetareas.model.User;
import com.example.gestordetareas.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class userControllerGet {

    private final UserRepository userRepository;

    public userControllerGet(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/usuarios")
    public List<User> getAllUsuarios() {
        return userRepository.findAll();
    }
}

package com.example.gestordetareas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gestordetareas.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void eliminarUsuario(Long id) {
        userRepository.deleteById(id);
    }
}

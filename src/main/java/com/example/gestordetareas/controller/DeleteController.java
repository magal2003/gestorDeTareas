package com.example.gestordetareas.controller;

import com.example.gestordetareas.service.TaskService;
import com.example.gestordetareas.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete")
public class DeleteController {

    @Autowired
    private UserService userService;

    @Autowired
    private TaskService tareaService;

    // DELETE USUARIOS
    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        userService.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }

    // DELETE TAREAS
    @DeleteMapping("/tareas/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
        return ResponseEntity.noContent().build();
    }
}
package com.example.gestordetareas.controller;

import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.service.TaskService;
import com.example.gestordetareas.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/get")


public class GetTaskController {


    @Autowired
    private TaskService tareaService;

    @GetMapping("/ping")
    public String ping() { return "ok"; }


    // GET TODAS LAS TAREAS
    @GetMapping("/tareas")
    public ResponseEntity<List<Task>> obtenerTodasLasTareas() {
        List<Task> tareas = tareaService.getAll();
        return ResponseEntity.ok(tareas);
    }

    // GET TAREAS POR USUARIO
    @GetMapping("/tareas/usuario/{idUsuario}")
    public ResponseEntity<List<Task>> obtenerTareasPorUsuario(@PathVariable Long idUsuario) {
        List<Task> tareas = tareaService.getByUsuario(idUsuario);
        return ResponseEntity.ok(tareas);
    }

    // GET UNA SOLA TAREA POR ID
    @GetMapping("/tareas/{id}")
    public ResponseEntity<Task> obtenerTareaPorId(@PathVariable Long id) {
        Task tarea = tareaService.getById(id);
        return ResponseEntity.ok(tarea);
    }
}

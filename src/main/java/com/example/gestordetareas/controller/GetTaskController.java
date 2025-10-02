package com.example.gestordetareas.controller;

import com.example.gestordetareas.dto.TaskDTO;
import com.example.gestordetareas.service.TaskService;
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
    public String ping() {
        return "ok";
    }

    // GET TODAS LAS TAREAS
    @GetMapping("/tareas")
    public ResponseEntity<List<TaskDTO>> obtenerTodasLasTareas() {
        return ResponseEntity.ok(tareaService.getAll());
    }

    // GET TAREAS POR USUARIO
    @GetMapping("/tareas/usuario/{idUsuario}")
    public ResponseEntity<List<TaskDTO>> obtenerTareasPorUsuario(@PathVariable Long idUsuario) {
        return ResponseEntity.ok(tareaService.getByUsuario(idUsuario));
    }

    // GET UNA SOLA TAREA POR ID
    @GetMapping("/tareas/{id}")
    public ResponseEntity<TaskDTO> obtenerTareaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(tareaService.getById(id));
    }
}

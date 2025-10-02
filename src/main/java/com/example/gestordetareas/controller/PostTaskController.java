package com.example.gestordetareas.controller;

import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
public class PostTaskController {

    @Autowired
    private TaskRepository taskRepo;

    @PostMapping
    public Task crearTarea(@RequestBody Task task) {
        return taskRepo.save(task);
    }

}



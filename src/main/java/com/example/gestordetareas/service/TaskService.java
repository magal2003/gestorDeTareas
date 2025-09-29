package com.example.gestordetareas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gestordetareas.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository tareaRepository;

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}

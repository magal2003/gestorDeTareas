package com.example.gestordetareas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.repository.TaskRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskService {

    @Autowired
    private TaskRepository tareaRepository;

    public List<Task> getAll(){
        return tareaRepository.findAll();
    }

    public List<Task> getByUsuario(Long idUsuario){
        return tareaRepository.findByUser_IdUsuario(idUsuario);
    }

    public Task getById(Long id){
        return tareaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("No se encontró la tarea con id: "+id));
    }


    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}

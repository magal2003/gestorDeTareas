package com.example.gestordetareas.service;

import com.example.gestordetareas.dto.TaskDTO;
import com.example.gestordetareas.model.Task;
import com.example.gestordetareas.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository tareaRepository;

    // ---- Mapper Entidad -> DTO (solo lectura) ----
    private TaskDTO toDTO(Task t) {
        return TaskDTO.builder()
                .id(t.getId())
                .titulo(t.getTitulo())
                .description(t.getDescription())
                .status(t.getStatus())
                .prioridad(t.getPrioridad())
                .fechaLimite(t.getFechaLimite())
                .createdAt(t.getCreatedAt())
                .updatedAt(t.getUpdatedAt())
                // OJO: si User usa getIdUsuario(), cambia aquí
                .userId(t.getUser() != null ? t.getUser().getIdUsuario() : null)
                .build();
    }

    // ---- GET: todas ----
    public List<TaskDTO> getAll() {
        return tareaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    // ---- GET: por usuario ----
    public List<TaskDTO> getByUsuario(Long idUsuario) {
        // Si en User el @Id se llama idUsuario, usa findByUser_IdUsuario
        return tareaRepository.findByUser_IdUsuario(idUsuario)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    // ---- GET: por id de tarea ----
    public TaskDTO getById(Long id) {
        Task t = tareaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("No se encontró la tarea con id: " + id));
        return toDTO(t);
    }

    // ---- DELETE: de tu compañera ----
    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}

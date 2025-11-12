package com.example.gestordetareas.repository;

import com.example.gestordetareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // Si en User: private Long id;
    List<Task> findByUser_IdUsuario(Long idUsuario);

    // Si en User: private Long idUsuario;
    // List<Task> findByUser_IdUsuario(Long idUsuario);
}

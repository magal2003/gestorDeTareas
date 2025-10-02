package com.example.gestordetareas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

//Librerias para las fechas
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tareas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String titulo;
    
    private String description;
    private String status;
    private String prioridad;

    @Column(name = "fecha_limite")
    private LocalDateTime fechaLimite;

    /*@Column(name = "created_at")
    private LocalDateTime createdAt;*/

    @CreationTimestamp
    @Column(name="created_at",nullable = false/*Indica que en la base este valor es not null */,updatable = false/*Asegura que este valor no se cambia en updates solo en inserts */)
    private LocalDateTime createdAt;

    /*@Column(name = "updated_at")
    private LocalDateTime updatedAt;*/

    @UpdateTimestamp
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private User user;
}


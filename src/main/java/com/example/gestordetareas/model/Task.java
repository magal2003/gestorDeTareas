package com.example.gestordetareas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

//Librerias para las fechas
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tareas")
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

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public LocalDateTime getFechaLimite() { return fechaLimite; }
    public void setFechaLimite(LocalDateTime fechaLimite) { this.fechaLimite = fechaLimite; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
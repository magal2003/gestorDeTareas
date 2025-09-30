package com.example.gestordetareas.dto;

import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class taskDTO {
    private Long id;
    private String titulo;
    private String description;
    private String status;
    private String prioridad;
    private LocalDateTime fechaLimite;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long userId; // opcional
}

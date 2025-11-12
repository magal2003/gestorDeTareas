# 📝 Gestor de Tareas (Java + Spring Boot)

## 📖 Descripción

El **Gestor de Tareas** es una aplicación desarrollada en **Java 17** con **Spring Boot 3.5.6** que permite crear, editar, eliminar y marcar tareas como completadas.  
El proyecto forma parte del plan de aprendizaje *Full Stack Java + React*, cuyo objetivo es dominar desde la programación orientada a objetos hasta el despliegue de aplicaciones web y móviles.

Este repositorio representa la **fase backend** del proyecto, centrada en la creación de una API REST con persistencia de datos en **H2** (para desarrollo) y **PostgreSQL** (para entornos productivos).

---

## 🧩 Tecnologías Utilizadas

### 🔹 Backend
- **Java 17** – Lenguaje base del proyecto.
- **Spring Boot 3.5.6** – Framework para construir aplicaciones empresariales y servicios REST.
- **Spring Web (spring-boot-starter-web)** – Gestión de controladores y endpoints HTTP.
- **Spring Data JPA (Hibernate)** – Mapeo objeto-relacional y manejo de entidades persistentes.
- **Spring Validation** – Validación de datos mediante anotaciones (`@NotNull`, `@Email`, etc.).
- **Lombok** – Generación automática de getters, setters y constructores.

### 🔹 Bases de Datos
- **H2 Database** – Base embebida utilizada para desarrollo y pruebas locales.
- **PostgreSQL** – Base de datos relacional utilizada en entornos productivos.

### 🔹 Testing y Herramientas
- **Spring Boot Starter Test** – Framework de pruebas integradas con JUnit 5 y Mockito.
- **Maven** – Sistema de gestión de dependencias y empaquetado.
- **Spring Boot Maven Plugin** – Permite ejecutar el proyecto con `mvn spring-boot:run`.
- **Git / GitHub** – Control de versiones y colaboración.

---

## ⚙️ Instalación y Ejecución

### 🔹 1. Clonar el repositorio
```bash
git clone https://github.com/magal2003/gestorDeTareas.git
cd gestorDeTareas
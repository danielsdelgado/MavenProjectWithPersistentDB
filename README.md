# 📘 Proyecto: Gestión de Alumnos y Cursos con PostgreSQL (Spring Boot + Maven)
---
<details>
<summary>ESPAÑOL 🇪🇸</summary>

## 🧩 Descripción

Este proyecto es una aplicación Java construida con **Maven** que utiliza una base de datos **PostgreSQL** para almacenar información sobre **alumnos** y **cursos**. Permite operaciones **CRUD completas** mediante una **API REST** y vistas para consultar cursos activos.

## ⚙️ Tecnologías utilizadas

* Java 17+
* Spring Boot
* Spring Web (REST API)
* Spring Data JPA (PostgreSQL)
* PostgreSQL
* Maven
* Jakarta Validation
* Docker / pgAdmin4 (opcional)

## Estructura del Proyecto

```
src/
 └── main/
     ├── java/com/example/proyectomavenpersistentdatabase/
     │   ├── controller/        # Controladores REST (AlumnoController, CursoActivoViewController)
     │   ├── domain/            # Entidades (Alumno, CursoActivoView)
     │   ├── repository/        # Repositorios JPA
     │   └── service/           # Servicios de negocio
     └── resources/
         └── application.properties
pom.xml
httprequest.http -> Endpoints para interactuar con la API

## Endpoints Disponibles

### Alumnos

| Método | Endpoint        | Descripción             |
| ------ | --------------- | ----------------------- |
| GET    | `/alumnos`      | Lista todos los alumnos |
| POST   | `/alumnos`      | Crear un alumno         |
| GET    | `/alumnos/{id}` | Obtener alumno por ID   |
| PUT    | `/alumnos/{id}` | Actualizar alumno       |
| DELETE | `/alumnos/{id}` | Eliminar alumno         |

### Cursos

| Método | Endpoint       | Descripción            |
| ------ | -------------- | ---------------------- |
| GET    | `/cursos`      | Lista todos los cursos |
| POST   | `/cursos`      | Crear un curso         |
| GET    | `/cursos/{id}` | Obtener curso por ID   |
| PUT    | `/cursos/{id}` | Actualizar curso       |
| DELETE | `/cursos/{id}` | Eliminar curso         |

### Cursos activos

| Método | Endpoint              | Descripción                   |
| ------ | --------------------- | ----------------------------- |
| GET    | `/api/cursos/activos` | Lista solo los cursos activos |

## Base de Datos

### Tablas

```sql
CREATE TABLE alumnos (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(100),
  edad INT
);

CREATE TABLE cursos (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  descripcion TEXT,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  activo BOOLEAN DEFAULT true
);
```

### Vista de cursos activos

```sql
CREATE VIEW vw_cursos_activos AS
SELECT * FROM cursos
WHERE activo = true;
```

## Configuración (`application.properties`)

```properties
spring.application.name=proyectomavenpersistentdatabase
spring.datasource.url=jdbc:postgresql://localhost:5432/escuela
spring.datasource.username=admin
spring.datasource.password=admin123
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
server.port=8081
```

## Ejecutar proyecto

1. Configurar base de datos con Docker: `docker-compose up -d`
2. Conectarse desde pgAdmin4 (Host: postgres-db, Puerto: 5432, Usuario: admin, Contraseña: admin123, DB: escuela)
3. Crear tablas `alumnos` y `cursos`
4. Ejecutar aplicación Spring Boot: `./mvnw spring-boot:run`
5. Base URL de la API: `http://localhost:8081`

## Scripts de prueba

`script.js` contiene funciones para interactuar con la API desde el frontend (CRUD alumnos y cursos, y consulta de cursos activos).

</details>

<details>
<summary>ENGLISH 🇬🇧</summary>
 
## 🧩 Description

This project is a Java application built with **Maven** using **PostgreSQL** to store information about **students** and **courses**. It provides full **CRUD operations** through a **REST API** and views to query active courses.

## ⚙️ Technologies

* Java 17+
* Spring Boot
* Spring Web (REST API)
* Spring Data JPA (PostgreSQL)
* PostgreSQL
* Maven
* Jakarta Validation
* Docker / pgAdmin4 (optional)

## Project Structure

```
src/
 └── main/
     ├── java/com/example/proyectomavenpersistentdatabase/
     │   ├── controller/        # REST Controllers (AlumnoController, CursoActivoViewController)
     │   ├── domain/            # Entities (Alumno, CursoActivoView)
     │   ├── repository/        # JPA Repositories
     │   └── service/           # Business services
     └── resources/
         └── application.properties
pom.xml
httprequest.http -> Endpoints to interact with the API

## Available Endpoints

### Students

| Method | Endpoint        | Description       |
| ------ | --------------- | ----------------- |
| GET    | `/alumnos`      | List all students |
| POST   | `/alumnos`      | Create a student  |
| GET    | `/alumnos/{id}` | Get student by ID |
| PUT    | `/alumnos/{id}` | Update student    |
| DELETE | `/alumnos/{id}` | Delete student    |

### Courses

| Method | Endpoint       | Description      |
| ------ | -------------- | ---------------- |
| GET    | `/cursos`      | List all courses |
| POST   | `/cursos`      | Create a course  |
| GET    | `/cursos/{id}` | Get course by ID |
| PUT    | `/cursos/{id}` | Update course    |
| DELETE | `/cursos/{id}` | Delete course    |

### Active courses

| Method | Endpoint              | Description              |
| ------ | --------------------- | ------------------------ |
| GET    | `/api/cursos/activos` | List only active courses |

## Database

### Tables

```sql
CREATE TABLE alumnos (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(100),
  edad INT
);

CREATE TABLE cursos (
  id SERIAL PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  descripcion TEXT,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  activo BOOLEAN DEFAULT true
);
```

### Active courses view

```sql
CREATE VIEW vw_cursos_activos AS
SELECT * FROM cursos
WHERE activo = true;
```

## Configuration (`application.properties`)

```properties
spring.application.name=proyectomavenpersistentdatabase
spring.datasource.url=jdbc:postgresql://localhost:5432/escuela
spring.datasource.username=admin
spring.datasource.password=admin123
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
server.port=8081
```

## Running the Project

1. Set up database with Docker: `docker-compose up -d`
2. Connect with pgAdmin4 (Host: postgres-db, Port: 5432, User: admin, Password: admin123, DB: escuela)
3. Create `alumnos` and `cursos` tables
4. Run Spring Boot application: `./mvnw spring-boot:run`
5. API Base URL: `http://localhost:8081`

## Test Scripts

`script.js` contains functions to interact with the API from the frontend (CRUD for students and courses, and querying active courses).

</details>

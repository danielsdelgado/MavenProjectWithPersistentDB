# 📘 MavenProjectWithPersistentDB / Proyecto Maven con Base de Datos Persistente

<details>
<summary>ESPAÑOL 🇪🇸</summary>

## 🧩 Descripción

Este proyecto es una **aplicación Java construida con Maven** que utiliza **una base de datos sql PostgreSQL** para almacenar información sobre **cursos y alumnos**.
Permite realizar **operaciones CRUD** (Crear, Leer, Actualizar, Eliminar) mediante una **API REST**.

---

## ⚙️ Tecnologías utilizadas

* **Java 17**
* **Spring Boot**
* **Database PosgreSQL** (in-memory)
* **Maven**
* **Jakarta Validation**

---

## 🧩 Estructura del proyecto

```
MavenProjectWithPersistentDB/
├── src/
│   ├── main/
│   │   ├── java/com/example/demoh2/
│   │   │   ├── controller/
│   │   │   ├── domain/
│   │   │   ├── dto/
│   │   │   ├── mapper/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── scripts/
    └── script.js
```

---

## 🌐 Endpoints disponibles

### 👩‍🏫 Cursos

| Método | Endpoint           | Descripción             |
| ------ | ------------------ | ----------------------- |
| GET    | `/api/cursos`      | Listar todos los cursos |
| POST   | `/api/cursos`      | Crear un curso          |
| PUT    | `/api/cursos/{id}` | Actualizar un curso     |
| DELETE | `/api/cursos/{id}` | Eliminar un curso       |

### 👨‍🎓 Alumnos

| Método | Endpoint            | Descripción              |
| ------ | ------------------- | ------------------------ |
| GET    | `/api/alumnos`      | Listar todos los alumnos |
| POST   | `/api/alumnos`      | Crear un alumno          |
| GET    | `/api/alumnos/{id}` | Obtener un alumno por ID |
| PUT    | `/api/alumnos/{id}` | Actualizar un alumno     |
| DELETE | `/api/alumnos/{id}` | Eliminar un alumno       |

---

## 🧰 Configuración (`application.properties`)

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=8081
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.show-sql=true

spring.security.user.name=admin
spring.security.user.password=admin

## 📝 Scripts de prueba

* `scripts/script.js` → Funciones para interactuar con la API desde el frontend: crear, actualizar, eliminar y leer cursos y alumnos.

---

## ▶️ Ejecutar el proyecto

```bash
git clone https://github.com/danielsdelgado/MavenProjectWithPersistentDB.git
cd MavenProjectWithPersistentDB
./mvnw spring-boot:run
```

Abrir en el navegador: [http://localhost:8081](http://localhost:8081)

</details>

<details>
<summary>ENGLISH 🇬🇧</summary>

## 🧩 Description

This project is a **Java application built with Maven** that uses **an PosgreSQL database** to store information about **courses and students**.
It provides **CRUD operations** (Create, Read, Update, Delete) via a **RESTful API**.

---

## ⚙️ Technologies Used

* **Java 17**
* **Spring Boot**
* **Database PostgreSQL**
* **Maven**
* **Jakarta Validation**

---

## 🧩 Project Structure

```
MavenProjectWithPersistentDB/
├── src/
│   ├── main/
│   │   ├── java/com/example/demoh2/
│   │   │   ├── controller/
│   │   │   ├── domain/
│   │   │   ├── dto/
│   │   │   ├── mapper/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── scripts/
    └── script.js
```

---

## 🌐 Available Endpoints

### 👩‍🏫 Courses

| Method | Endpoint           | Description      |
| ------ | ------------------ | ---------------- |
| GET    | `/api/cursos`      | List all courses |
| POST   | `/api/cursos`      | Create a course  |
| PUT    | `/api/cursos/{id}` | Update a course  |
| DELETE | `/api/cursos/{id}` | Delete a course  |

### 👨‍🎓 Students

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| GET    | `/api/alumnos`      | List all students   |
| POST   | `/api/alumnos`      | Create a student    |
| GET    | `/api/alumnos/{id}` | Get a student by ID |
| PUT    | `/api/alumnos/{id}` | Update a student    |
| DELETE | `/api/alumnos/{id}` | Delete a student    |

---

## 🧰 Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=8081
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.show-sql=true

spring.security.user.name=admin
spring.security.user.password=admin


## 📝 Test Scripts

* `scripts/script.js` → Functions to interact with the API from the frontend: create, update, delete, and read courses and students.

---

## ▶️ Running the Project

```bash
git clone https://github.com/danielsdelgado/MavenProjectWithPersistentDB.git
cd MavenProjectWithPersistentDB
./mvnw spring-boot:run
```

Open in browser: [http://localhost:8081](http://localhost:8081)

</details> 

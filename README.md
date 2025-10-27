# MavenProjectWithPersistentDB / Proyecto Maven con Base de Datos Persistente

## Descripción / Description

**ES:**
Este proyecto es una aplicación Java construida con Maven que utiliza una base de datos H2 en memoria para almacenar información sobre cursos y alumnos. Permite operaciones CRUD (Crear, Leer, Actualizar, Eliminar) mediante una API REST.

**EN:**
This project is a Java application built with Maven that uses an H2 in-memory database to store information about courses and students. It provides CRUD (Create, Read, Update, Delete) operations via a RESTful API.

---

## Tecnologías / Technologies

* **Java 17**
* **Spring Boot**
* **H2 Database** (in-memory)
* **Maven**
* **Jakarta Validation**

---

## Estructura del Proyecto / Project Structure

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com/example/demoh2
│   │   │   │   ├── controller
│   │   │   │   ├── domain
│   │   │   │   ├── dto
│   │   │   │   ├── mapper
│   │   │   │   └── service
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── scripts
    └── script.js
```

---

## Endpoints Disponibles / Available Endpoints

### Cursos / Courses

* `GET /api/cursos` → Listar todos los cursos / List all courses
* `POST /api/cursos` → Crear un curso / Create a course
* `PUT /api/cursos/{id}` → Actualizar curso / Update a course
* `DELETE /api/cursos/{id}` → Eliminar curso / Delete a course

### Alumnos / Students

* `GET /api/alumnos` → Listar todos los alumnos / List all students
* `POST /api/alumnos` → Crear un alumno / Create a student
* `GET /api/alumnos/{id}` → Obtener alumno por ID / Get a student by ID
* `PUT /api/alumnos/{id}` → Actualizar alumno / Update a student
* `DELETE /api/alumnos/{id}` → Eliminar alumno / Delete a student

---

## Configuración / Configuration

### application.properties

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
```

### Seguridad / Security

```properties
spring.security.user.name=admin
spring.security.user.password=admin
```

---

## Scripts de prueba / Test Scripts

* `script.js` → Funciones para interactuar con la API desde el frontend, incluyendo creación, actualización, eliminación y lectura de cursos y alumnos.

---

## Ejecutar el proyecto / Running the Project

1. Clonar el repositorio / Clone the repository:

```bash
git clone https://github.com/danielsdelgado/MavenProjectWithPersistentDB.git
cd MavenProjectWithPersistentDB
```

2. Ejecutar la aplicación / Run the application:

```bash
./mvnw spring-boot:run
```

3. Acceder a la consola H2 / Access the H2 console:

[http://localhost:8081/h2-console](http://localhost:8081/h2-console)

* JDBC URL: `jdbc:h2:mem:testdb`
* Usuario / User: `sa`
* Contraseña / Password: (vacío / blank)

---

## Contribuciones / Contributions

Contribuciones son bienvenidas. Por favor abre un **issue** o envía un **pull request** para mejoras o correcciones.

---

Si quieres, puedo hacer también una **versión visual con tablas de endpoints y autenticación**, más estilo “documentación de API profesional” dentro del README, para que se vea más limpio y fácil de leer.

¿Quieres que haga eso?

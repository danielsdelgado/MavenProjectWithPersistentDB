package com.example.proyectomavenpersistentdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectomavenpersistentdatabase.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Puedes agregar métodos personalizados si quieres, por ejemplo:
    // List<Alumno> findByNombreContainsIgnoreCase(String nombre);
}

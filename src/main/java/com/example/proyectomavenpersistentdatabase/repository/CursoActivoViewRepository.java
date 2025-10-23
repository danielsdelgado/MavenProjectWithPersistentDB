package com.example.proyectomavenpersistentdatabase.repository;
  
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectomavenpersistentdatabase.domain.CursoActivoView;

public interface CursoActivoViewRepository extends JpaRepository<CursoActivoView, Long> {
    // Ejemplo opcional:
    // List<CursoActivoView> findByNombreContainsIgnoreCase(String nombre);
}

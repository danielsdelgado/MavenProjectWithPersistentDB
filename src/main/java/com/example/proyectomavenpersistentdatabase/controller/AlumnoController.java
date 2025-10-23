package com.example.proyectomavenpersistentdatabase.controller; 

import java.util.List; 
import org.springframework.web.bind.annotation.*; 
import com.example.proyectomavenpersistentdatabase.domain.Alumno;
import com.example.proyectomavenpersistentdatabase.repository.AlumnoRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoRepository alumnoRepository;

    public AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    // Obtener todos los alumnos
    @GetMapping
    public List<Alumno> getAll() {
        return alumnoRepository.findAll();
    }

    // Crear un nuevo alumno
    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    // (Opcional) Obtener un alumno por ID
    @GetMapping("/{id}")
    public Alumno getById(@PathVariable Long id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con id " + id));
    }

    // (Opcional) Actualizar alumno
    @PutMapping("/{id}")
    public Alumno update(@PathVariable Long id, @RequestBody Alumno alumnoDetails) {
        Alumno alumno = alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con id " + id));

        alumno.setNombre(alumnoDetails.getNombre());
        alumno.setEdad(alumnoDetails.getEdad());

        return alumnoRepository.save(alumno);
    }

    // (Opcional) Eliminar alumno
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        alumnoRepository.deleteById(id);
    }
}

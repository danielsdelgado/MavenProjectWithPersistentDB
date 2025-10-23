package com.example.proyectomavenpersistentdatabase.controller; 

import org.springframework.web.bind.annotation.*;

import com.example.proyectomavenpersistentdatabase.domain.CursoActivoView;
import com.example.proyectomavenpersistentdatabase.service.CursoActivoViewService;

import java.util.List;

@RestController
@RequestMapping("/api/cursos/activos")
public class CursoActivoViewController {

    private final CursoActivoViewService service;

    public CursoActivoViewController(CursoActivoViewService service) {
        this.service = service;
    }

    @GetMapping
    public List<CursoActivoView> getAll() {
        return service.listar();
    }
}

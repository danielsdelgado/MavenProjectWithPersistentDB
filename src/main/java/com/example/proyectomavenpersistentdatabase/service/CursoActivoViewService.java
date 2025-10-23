package com.example.proyectomavenpersistentdatabase.service;

import org.springframework.stereotype.Service;
import com.example.proyectomavenpersistentdatabase.repository.CursoActivoViewRepository;
import com.example.proyectomavenpersistentdatabase.domain.CursoActivoView;

import java.util.List;

@Service
public class CursoActivoViewService {

    private final CursoActivoViewRepository repo;

    public CursoActivoViewService(CursoActivoViewRepository repo) {
        this.repo = repo;
    }

    public List<CursoActivoView> listar() {
        return repo.findAll();
    }
}

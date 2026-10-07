package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Inscripcion;

@RestController
@RequestMapping("/api/v1/inscripcion")
public class InscripcionController {
    @Autowired
    private InscripcionRepository inscripcionRepository;

    @GetMapping
    public List<Inscripcion> getAllInscripciones() {
        return inscripcionRepository.findAll();
    }

    @PostMapping
    public Inscripcion createInscripcion(@RequestBody Inscripcion i) {
        return inscripcionRepository.save(i);
    }
}

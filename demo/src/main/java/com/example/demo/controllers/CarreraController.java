package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Carrera;
import com.example.demo.repositories.CarreraRepository;

@RestController
@RequestMapping("/api/v1/carrera")
public class CarreraController {
    @Autowired
    private CarreraRepository carreraRepository;

    @GetMapping
    public List<Carrera> getAllCarreras() {
        return carreraRepository.findAll();
    }

    @PostMapping
    public Carrera createCarrera(@RequestBody Carrera c) {
        return carreraRepository.save(c);
    }
}

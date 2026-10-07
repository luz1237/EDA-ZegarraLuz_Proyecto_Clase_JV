package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Carrera;

public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}

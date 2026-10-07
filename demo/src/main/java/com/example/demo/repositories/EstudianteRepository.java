package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Estudiante;
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}

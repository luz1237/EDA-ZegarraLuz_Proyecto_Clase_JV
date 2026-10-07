package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Inscripcion;
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}

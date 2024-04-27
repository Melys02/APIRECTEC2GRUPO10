package edu.cibertec.APIRESTEC2GRUPO10.repository;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepositorio
        extends JpaRepository<Personaje, Integer> {
}

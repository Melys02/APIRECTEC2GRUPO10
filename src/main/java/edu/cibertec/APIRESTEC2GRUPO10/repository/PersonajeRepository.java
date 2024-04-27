package edu.cibertec.APIRESTEC2GRUPO10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer>{
}


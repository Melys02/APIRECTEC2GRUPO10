package edu.cibertec.APIRESTEC2GRUPO10.repository;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Programatv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramatcRepositorio
        extends JpaRepository<Programatv, Integer> {
}

package edu.cibertec.APIRESTEC2GRUPO10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.cibertec.APIRESTEC2GRUPO10.model.bd.ProgramaTv;

@Repository
public interface ProgramaTvRepository extends JpaRepository<ProgramaTv, Integer> {
}

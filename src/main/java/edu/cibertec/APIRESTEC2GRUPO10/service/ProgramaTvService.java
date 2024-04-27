package edu.cibertec.APIRESTEC2GRUPO10.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import edu.cibertec.APIRESTEC2GRUPO10.model.bd.ProgramaTv;
import edu.cibertec.APIRESTEC2GRUPO10.repository.ProgramaTvRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProgramaTvService implements IProgramaTvService{
    private ProgramaTvRepository programaTvRepository;


    @Override
    public List<ProgramaTv> listaProgramas() {
        return programaTvRepository.findAll();
    }
}

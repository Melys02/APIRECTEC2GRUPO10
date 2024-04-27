package edu.cibertec.APIRESTEC2GRUPO10.service;

import edu.cibertec.APIRESTEC2GRUPO10.service.IPersonajeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;
import edu.cibertec.APIRESTEC2GRUPO10.repository.PersonajeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonajeService implements IPersonajeService {
    private PersonajeRepository personajeRepository;

    @Override
    public List<Personaje> listapersonajes() {
        return personajeRepository.findAll();
    }
}

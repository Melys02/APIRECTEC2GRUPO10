package edu.cibertec.APIRESTEC2GRUPO10.service;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;
import edu.cibertec.APIRESTEC2GRUPO10.repository.PersonajeRepositorio;

import java.util.List;

public class PersonajeService {
    private PersonajeRepositorio personajeRepository;

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }


}

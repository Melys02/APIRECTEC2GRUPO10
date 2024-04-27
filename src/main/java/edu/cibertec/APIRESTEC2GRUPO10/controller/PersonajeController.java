package edu.cibertec.APIRESTEC2GRUPO10.controller;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;
import edu.cibertec.APIRESTEC2GRUPO10.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {
    @Autowired
    private PersonajeRepository personajeRepository;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }
}
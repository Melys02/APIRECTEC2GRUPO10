package edu.cibertec.APIRESTEC2GRUPO10.model.dto.request;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.Personaje;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramaTvdto {
    private Integer idprogramatv;
    private String titulo;
    private String resumen;
    private Date fechainicio;
    private Personaje idpersonaje;


    private List<Personajedto> programatv = new ArrayList<>();

}

package edu.cibertec.APIRESTEC2GRUPO10.model.dto.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Personajedto
{
    private String nompersonaje;
    private String apepersonaje;
    private Date fechnacpersonaje;

    private List<Personajedto> personaje = new ArrayList<>();

}

package edu.cibertec.APIRESTEC2GRUPO10.model.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonajeRequestDto {
    private String nompersonaje;
    private String apepersonaje;
    private List<ProgramatvRequestDto> programatv = new ArrayList<>();

}

package edu.cibertec.APIRESTEC2GRUPO10.model.dto;

import lombok.Data;

import java.util.Date;


@Data
public class ProgramatvRequestDto {
    private String titulo;
  private String resumen;
  private Date fechainicio;

}

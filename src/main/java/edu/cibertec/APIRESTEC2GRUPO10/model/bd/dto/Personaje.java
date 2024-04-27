package edu.cibertec.APIRESTEC2GRUPO10.model.bd.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FilenameFilter;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "personaje")
public class Personaje {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersonaje;
    private String nompersonaje;
    private String apepersonaje;
    private Date fechnacpersonaje;
}

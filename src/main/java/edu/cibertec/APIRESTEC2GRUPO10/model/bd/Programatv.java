package edu.cibertec.APIRESTEC2GRUPO10.model.bd;

import edu.cibertec.APIRESTEC2GRUPO10.model.bd.dto.Personaje;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name =  "programatv")
public class Programatv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprogramatv;
    private String titulo;
    private String resumen;
    private Date fechainicio;
    @ManyToOne
    @JoinColumn(name = "idpersonaje")
    private Personaje personaje;

}

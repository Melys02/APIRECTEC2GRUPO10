package edu.cibertec.APIRESTEC2GRUPO10.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.cibertec.APIRESTEC2GRUPO10.model.bd.ProgramaTv;
import edu.cibertec.APIRESTEC2GRUPO10.service.IProgramaTvService;

import java.util.List;

@RestController
@RequestMapping("/api/rest/programa")
@AllArgsConstructor
public class ProgramaTvController {
    private IProgramaTvService iProgramaTvService;

    @GetMapping("")
    public List<ProgramaTv> listarProgramas(){
        return iProgramaTvService.listaProgramas();
    }
}
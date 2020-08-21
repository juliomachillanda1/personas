package com.personas.personas.controller.rest;

import com.personas.personas.domain.Persona;
import com.personas.personas.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> buscarTodas() {
        return personaService.buscarTodas();
    }
}

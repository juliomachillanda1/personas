package com.personas.personas.controller.rest;

import com.personas.personas.domain.Persona;
import com.personas.personas.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> buscarTodas() {
        return personaService.buscarTodas();
    }

    @PostMapping("/personas")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona crear(@RequestBody Persona persona) {
        return personaService.crear(persona);
    }
}

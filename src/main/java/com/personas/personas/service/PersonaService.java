package com.personas.personas.service;

import com.personas.personas.domain.Persona;
import com.personas.personas.repository.PersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> buscarTodas() {
        return personaRepository.findAll();
    }

    public Persona crear(Persona persona) {
        return personaRepository.save(persona);
    }

    public void eliminarPorId(Long personaId) {
        personaRepository.deleteById(personaId);
    }

}

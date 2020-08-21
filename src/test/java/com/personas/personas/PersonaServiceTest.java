package com.personas.personas;

import com.personas.personas.domain.Persona;
import com.personas.personas.repository.PersonaRepository;
import com.personas.personas.service.PersonaService;
import java.util.List;
import javax.transaction.Transactional;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class PersonaServiceTest {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    public void buscarTodas_conDosPersonasPersistidas_retornaListaPersonas() {

        List<Persona> personas = personaService.buscarTodas();

        assertThat(personas).hasSize(2);
    }

    @Test
    public void buscarTodas_sinPersonas_retornaListaVacia() {
        personaRepository.deleteAll();

        List<Persona> personas = personaService.buscarTodas();

        assertThat(personas).isEmpty();
    }

}

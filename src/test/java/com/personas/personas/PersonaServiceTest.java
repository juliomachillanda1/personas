package com.personas.personas;

import com.personas.personas.domain.Persona;
import com.personas.personas.service.PersonaService;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonaServiceTest {

    @Autowired
    PersonaService personaService;

    @Test
    public void buscarTodas_conDosPersonasPersistidas_retornaListaPersonas() {

        List<Persona> personas = personaService.buscarTodas();

        assertThat(personas).hasSize(2);
    }

}

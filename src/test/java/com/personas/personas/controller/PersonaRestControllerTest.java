package com.personas.personas.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PersonaRestControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @Test
    public void crear_conCamposRequeridos_retornaHttpStatusCreated() throws Exception {
        String persona = "{\"nombre\": \"Paola\", \"apellido\" : \"Perez\", \"edad\": 21, \"sexo\": \"F\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/personas")
                .content(persona)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    public void crear_conPersonaSinNombre_retornaHttpStatusBadRequest() throws Exception {
        String persona = "{\"apellido\" : \"Perez\", \"edad\": 21, \"sexo\": \"F\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/personas")
                .content(persona)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void crear_conPersonaSinApellido_retornaHttpStatusBadRequest() throws Exception {
        String persona = "{\"nombre\": \"Paola\", \"edad\": 21, \"sexo\": \"F\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/personas")
                .content(persona)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void crear_conPersonaSinEdad_retornaHttpStatusBadRequest() throws Exception {
        String persona = "{\"nombre\": \"Paola\", \"apellido\" : \"Perez\", \"sexo\": \"F\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/personas")
                .content(persona)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void crear_conPersonaSinSexo_retornaHttpStatusBadRequest() throws Exception {
        String persona = "{\"nombre\": \"Paola\", \"apellido\" : \"Perez\", \"edad\": 21}";
        mockMvc.perform(MockMvcRequestBuilders.post("/personas")
                .content(persona)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

}

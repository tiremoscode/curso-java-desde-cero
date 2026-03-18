package com.curso.alumnos_api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @GetMapping("/alumnos/hola")
    public String holaMundo() {
        return "Hola desde mi API escrita en SpringBoot";
    }

    @GetMapping("/alumnos/holajson")
    public Map<String, Object> holaMundoJson() {
        Map<String, Object> respuestaJSON = new HashMap<>();
        respuestaJSON.put("modulo", "Alumnos");
        respuestaJSON.put("mensaje", "Hola desde i API creada en Springboot");
        respuestaJSON.put("numeroSuerte", 7);

        return respuestaJSON;
    }

}

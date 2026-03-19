package com.curso.alumnos_api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.alumnos_api.model.Alumno;
import com.curso.alumnos_api.service.AlumnoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    private final AlumnoService alumnoService;

    // Constructor para el servicio
    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola desde mi API escrita en SpringBoot";
    }

    @GetMapping("/holajson")
    public Map<String, Object> holaMundoJson() {
        Map<String, Object> respuestaJSON = new HashMap<>();
        respuestaJSON.put("modulo", "Alumnos");
        respuestaJSON.put("mensaje", "Hola desde i API creada en Springboot");
        respuestaJSON.put("numeroSuerte", 7);

        return respuestaJSON;
    }

    /* Listar todos los alumnos */
    @GetMapping
    public List<Alumno> obtenerAlumnos() {
        return alumnoService.obtenerAlumnos();
    }

    /* Obtener un solo alumno por su ID */
    @GetMapping("/{id}")
    public Alumno obtenerAlumnoPorId(@PathVariable Long id) {
        return alumnoService.obtenerAlumnoPorId(id);
    }

    /* Crear un nuevo alumno */
    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnoService.crearAlumno(alumno);
    }

    /* Actualizar un alumno */
    @PutMapping("/{id}")
    public Alumno actualizarAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.actualizarAlumno(id, alumno);
    }

    /* Eliminar un alumno */
    @DeleteMapping("/{id}")
    public String eliminarAlumno(@PathVariable Long id) {
        alumnoService.eliminarAlumno(id);
        return "Alumno eliminado exitosamente";
    }

}

package com.curso.alumnos_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.alumnos_api.exception.AlumnoNoEncontradoException;
import com.curso.alumnos_api.model.Alumno;
import com.curso.alumnos_api.repository.AlumnoRepository;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    /* Método para obtener todos los Alumnos */
    public List<Alumno> obtenerAlumnos() {
        return alumnoRepository.findAll();
    }

    /* Método para obtener un solo Alumno */
    public Alumno obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new AlumnoNoEncontradoException("El alumno con el ID " + id + " no existe"));
    }

    /* Método para Crear un nuevo Alumno */
    public Alumno crearAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    /* Método para Actualizar un Alumno */
    public Alumno actualizarAlumno(Long id, Alumno alumnoActualizado) {
        Alumno alumno = obtenerAlumnoPorId(id);
        alumno.setNombre(alumnoActualizado.getNombre());
        alumno.setEdad(alumnoActualizado.getEdad());
        return alumnoRepository.save(alumno);
    }

    /* Método para Eliminar un Alumno */
    public void eliminarAlumno(Long id) {
        Alumno alumno = obtenerAlumnoPorId(id);
        alumnoRepository.delete(alumno);
    }
}

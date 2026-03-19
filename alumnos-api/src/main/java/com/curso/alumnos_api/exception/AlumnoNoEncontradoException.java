package com.curso.alumnos_api.exception;

public class AlumnoNoEncontradoException extends RuntimeException {

    public AlumnoNoEncontradoException(String mensaje) {
        super(mensaje);
    }

}

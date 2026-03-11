package ejercicios_clase.alumnos_dao.app;

import java.util.List;

import ejercicios_clase.alumnos_dao.dao.AlumnoDAO;
import ejercicios_clase.alumnos_dao.model.Alumno;

public class Main {
    public static void main(String[] args) {

        AlumnoDAO dao = new AlumnoDAO();

        // Obtener Alumnos
        List<Alumno> alumnos = dao.obtenerAlumnos();

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(
                        alumno.getId() + " - " +
                                alumno.getNombre() + " - " +
                                alumno.getEdad());
            }
        }

    }
}

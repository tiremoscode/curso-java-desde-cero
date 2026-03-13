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

        // Crear un nuevo alumnos
        String nuevoNombreAlumno = "Javier";
        int nuevoEdadAlumno = 30;

        // Alumno nuevoAlumno = new Alumno(nuevoNombreAlumno, nuevoEdadAlumno);
        // dao.insertarAlumno(nuevoAlumno);

        // Actualizar el valor de un alumno
        String actualizarNombreAlumno = "Mauricio";
        int actualizarEdadAlumno = 20;
        int originalIdAlumno = 10;

        Alumno actualizarAlumno = new Alumno(actualizarNombreAlumno, actualizarEdadAlumno, originalIdAlumno);
        // dao.actualizarAlumno(actualizarAlumno);

        // Eliminar un alumno existente
        int idAlumnoEliminar = 11;
        dao.eliminarAlumno(idAlumnoEliminar);

    }
}

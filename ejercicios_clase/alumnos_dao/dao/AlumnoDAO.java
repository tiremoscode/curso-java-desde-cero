package ejercicios_clase.alumnos_dao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicios_clase.alumnos_dao.database.ConexionDB;
import ejercicios_clase.alumnos_dao.model.Alumno;

public class AlumnoDAO {

    /* Crear alumno - CREATE - INSERT */
    public void insertarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumnos(nombre, edad) VALUES (?, ?)";

        try {
            Connection conn = ConexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, alumno.getNombre());
            stmt.setInt(2, alumno.getEdad());

            int filasInsertar = stmt.executeUpdate();

            if (filasInsertar > 0) {
                System.out.println("Alumno insertado correctamente");
            } else {
                System.out.println("Error al insertar alumno");
            }

        } catch (SQLException e) {
            System.out.println("Error en Insertar datos");
            System.out.println(e.getMessage());
        }
    }

    /* Obtener Alumnos - READ - SELECT */
    public List<Alumno> obtenerAlumnos() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";

        try (Connection conn = ConexionDB.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEdad(rs.getInt("edad"));
                alumno.setId(rs.getInt("id"));

                listaAlumnos.add(alumno);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener alumnos");
            System.out.println(e.getMessage());
        }

        return listaAlumnos;
    }

    /* Actualizar Alumnos - UPDATE - UPDATE */
    public void actualizarAlumno(Alumno alumno) {
        String sql = "UPDATE alumnos SET nombre = ?, edad = ? WHERE id = ?";

        try {
            Connection conn = ConexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, alumno.getNombre());
            stmt.setInt(2, alumno.getEdad());
            stmt.setInt(3, alumno.getId());

            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Alumno actualizado correctamente");
            } else {
                System.out.println("Error al actualizar alumno");
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar alumnos");
            System.out.println(e.getMessage());
        }
    }

    /* Eliminar Alumno - DELETE - DELETE */

    public void eliminarAlumno(int id) {
        String sql = "DELETE FROM alumnos WHERE id = ?";

        try {
            Connection conn = ConexionDB.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Alumno eliminado correctamente");
            } else {
                System.out.println("Error al eliminar alumno, quizás no existe");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar alumnos");
            System.out.println(e.getMessage());
        }

    }

}
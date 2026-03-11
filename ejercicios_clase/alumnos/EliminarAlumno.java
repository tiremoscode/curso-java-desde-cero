package ejercicios_clase.alumnos;

import java.sql.*;

public class EliminarAlumno {
    public static void main(String[] args) {
        try {
            // Eliminar el registro de Marco
            // DELETE FROM alumnos WHERE id = 5;

            Connection conn = ConexionDB.conectar();

            int idAlumnoEliminar = 5;

            String queryEliminar = "DELETE FROM alumnos WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(queryEliminar);
            stmt.setInt(1, idAlumnoEliminar);

            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Alumno eliminado correctamente");
            } else {
                System.out.println("No se pudo eliminar o no se encontro el alumno");
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error ejecutando query inserción");
            System.out.println(e.getMessage());
        }
    }
}

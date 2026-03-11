package ejercicios_clase.alumnos;

import java.sql.*;

public class ActualizarAlumno {
    public static void main(String[] args) {
        try {
            Connection conn = ConexionDB.conectar();
            int nuevaEdad = 47;
            int idAlumno = 1;
            String queryActualizar = "UPDATE alumnos SET edad = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(queryActualizar);

            stmt.setInt(1, nuevaEdad);
            stmt.setInt(2, idAlumno);

            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Alumno actualizado correctamente");
            } else {
                System.out.println("No se pudo actualizar o no se encontro el alumno");
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error ejecutando query inserción");
            System.out.println(e.getMessage());
        }
    }
}

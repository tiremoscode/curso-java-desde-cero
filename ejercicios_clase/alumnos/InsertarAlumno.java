package ejercicios_clase.alumnos;

import java.sql.*;

public class InsertarAlumno {
    public static void main(String[] args) {
        try {
            Connection conn = ConexionDB.conectar();
            Statement stmt = conn.createStatement();
            String queryInsertar = "INSERT INTO alumnos(nombre, edad) VALUES('Marco', 25)";
            stmt.executeUpdate(queryInsertar);

            System.out.println("Alumno insertado correctamente");
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error ejecutando query inserción");
            System.out.println(e.getMessage());
        }
    }
}

package ejercicios_clase.alumnos;

import java.sql.*;

public class GrupoTg {
    public static void main(String[] args) {
        System.out.println("Clase de Java");
        Connection conn = ConexionDB.conectar();

        try {
            // Ejecutar mi primer query de base de datos
            // Obtener todos los alumnos inscritos en el Grupo TG en la tabla Alumnos.
            String sql = "SELECT * FROM alumnos";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("nombre") + " - " +
                                rs.getInt("edad"));
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error ejecutando query");
            System.out.println(e.getMessage());
        }
    }
}
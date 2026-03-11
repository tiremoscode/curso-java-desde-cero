package ejercicios_clase.alumnos;

import java.sql.*;

public class LeerAlumnos {
    public static void main(String[] args) {

        /**
         * CRUD es una aplicación que permite:
         * C - Create - Permite registrar un nuevo dato
         * R - Read - Lectura de los datos existentes
         * U - Update - Actualiza un dato existente.
         * D - Delete - Elimina física de un dato existente (PELIGROSO, no se recupera
         * dicho dato).
         */

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
            System.out.println("Error ejecutando query select");
            System.out.println(e.getMessage());
        }
    }
}
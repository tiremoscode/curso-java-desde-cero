package ejercicios_clase.alumnos_dao.database;

import java.sql.*;

public class ConexionDB {
    public static Connection conectar() {
        try {
            String urlServer = "jdbc:mysql://localhost:3306/grupotg";
            String userServer = "root";
            String passwordServer = "buttons";

            Connection conexion = DriverManager.getConnection(urlServer, userServer, passwordServer);

            System.out.println("Conexion establecida");

            return conexion;
        } catch (SQLException e) {
            System.out.println("Error en la conexión a bd");
            System.out.println(e.getMessage());
            return null;
        }
    }
}

### Ejemplo de conexión a Oracle

```java
package ejercicios_clase.alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDBOracle {

    public static Connection conectar() {
        // Replace with your service name (e.g., orcl, prod)
        String serviceName = "ORACEVD";
        String user = "HICEVD";
        String password = "HICEVD";

        String url = "jdbc:oracle:thin:@//localhost:1521/ORACEVD";

        try {
            Connection conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");

            return conexion;

        } catch (SQLException e) {
            System.out.println("Error en la conexion a la Base de Datos: " + e.getMessage());
            return null;
        }
    }

}

```

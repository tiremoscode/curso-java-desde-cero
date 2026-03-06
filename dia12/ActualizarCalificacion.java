package dia12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ActualizarCalificacion {
    public static void main(String[] args) {
        Path ruta = Path.of("dia12/multiples.txt");

        String alumnoBuscar = "Karla";
        String nuevaCalificacion = "9";

        try {
            List<String> lineas = Files.readAllLines(ruta);

            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                String[] datos = linea.split(",");

                String nombre = datos[0];

                if (nombre.equals(alumnoBuscar)) {
                    // Alumno fue encontrado
                    lineas.set(i, nombre + "," + nuevaCalificacion);
                    System.out.println("Alumno actualizado");
                } else {
                    System.out.println("Alumno no encontrado");
                }
            }

            Files.write(ruta, lineas);
            System.out.println("Calificaciones actualizadas");

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error al actualizar calificaciones");
            System.out.println(e.getMessage());
        }
    }
}

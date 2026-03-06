package dia12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineaPorLinea {
    public static void main(String[] args) {
        Path ruta = Path.of("dia12/multiples.txt");

        try {
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }
    }
}

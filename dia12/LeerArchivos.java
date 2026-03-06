package dia12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeerArchivos {
    public static void main(String[] args) {
        Path lecturaArchivos = Path.of("dia12/multiples2.txt");

        try {

            String contenidoMultiplesLineas = Files.readString(lecturaArchivos);
            System.out.println(contenidoMultiplesLineas);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }
    }
}

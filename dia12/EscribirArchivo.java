package dia12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirArchivo {
    public static void main(String[] args) {
        // Definición del path donde almacenaré mi información
        Path ruta = Path.of("dia12/clase.txt");

        try {
            Files.writeString(ruta, "Hola mundo desde Java");
            System.out.println("archivo se creo correctamente");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            System.out.println(e.getMessage());
        }
    }
}

package dia12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirMultiplesLineas {
    public static void main(String[] args) {
        Path multiple = Path.of("dia12/multiples.txt");

        String contenidoMultilinea = """
                Marco Antonio, 10
                Sandra, 9
                Miguel, 9
                Cesar, 10
                Hector, 8
                """;

        try {
            Files.writeString(multiple, contenidoMultilinea);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
            System.out.println(e.getMessage());
        }

    }
}

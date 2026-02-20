package dia04;

import java.util.Scanner;

public class ValidarDatos {
    public static void main(String[] args) {
        Scanner objetoScanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        String edadTexto = objetoScanner.nextLine();

        if (esNumerico(edadTexto)) {
            System.out.println("es un numero valido");
        } else {
            System.out.println("No es un numero valido");
        }

        objetoScanner.close();

    }

    public static boolean esNumerico(String texto) {
        return texto != null && texto.matches("\\d+");
    }
}

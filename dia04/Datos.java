package dia04;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {

        Scanner objetoScanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = objetoScanner.nextLine();

        System.out.println("Hola, gracias por usar mi app: " + nombre);

        objetoScanner.close();
    }
}

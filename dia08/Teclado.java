package dia08;

import java.util.Scanner;

public class Teclado {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        cerrarScanner();
    }

    public static void mostrarMenu() {
        int numero;

        do {
            System.out.println("Ingresa un numero (5 para salir): ");
            numero = scanner.nextInt();

            System.out.println("Numero ingresado " + numero);
        } while (numero != 5);
    }

    public static void cerrarScanner() {
        scanner.close();
        System.out.println("Scanner cerrado");
    }
}
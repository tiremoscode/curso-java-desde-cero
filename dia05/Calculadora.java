package dia05;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.println(("Ingresa el primer valor"));
        double valor1 = objScanner.nextDouble();

        System.out.println("el valor de valor1 es: " + valor1);

        System.out.println(("Ingresa el segundo valor"));
        double valor2 = objScanner.nextDouble();

        objScanner.close();

        System.out.println("el valor de valor2 es: " + valor2);

        System.out.println("Impresión de valores en calculadora");

        System.out.println("Suma " + (valor1 + valor2));
        System.out.println("Resta " + (valor1 - valor2));
        System.out.println("Multiplicación " + (valor1 * valor2));
        System.out.println("División " + (valor1 / valor2));

        System.out.println("Miguel " + (valor1 += valor2));

        int x = 5;
        System.out.println(x);
        System.out.println(x += 3);
        System.out.println(x);

    }
}

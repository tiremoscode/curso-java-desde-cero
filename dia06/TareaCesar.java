package dia06;

/*Calculadora */
import java.util.Scanner;

public class TareaCesar {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        String operacion;

        do {
            System.out.println("Que operacion desea realizar (+,-,/,* o exit para salir");
            operacion = objScanner.nextLine().trim();

            if (!operacion.equals("exit")) {

                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/")) {
                    System.out.println("Ingresa el primer valor:");
                    double primerValor = objScanner.nextDouble();

                    System.out.println("Ingresar el segundo valor:");
                    double segundoValor = objScanner.nextDouble();

                    objScanner.nextLine();

                    if (operacion.equals("+")) {
                        System.out.println("El resultado de la suma " + primerValor + " + " + segundoValor + " = "
                                + (primerValor + segundoValor));
                    } else if (operacion.equals("-")) {
                        System.out.println("El resultado de la resta " + primerValor + " - " + segundoValor + " = "
                                + (primerValor - segundoValor));
                    } else if (operacion.equals("*")) {
                        System.out.println(
                                "El resultado de la multiplicación " + primerValor + " - " + segundoValor + " = "
                                        + (primerValor * segundoValor));
                    } else if (operacion.equals("/")) {
                        System.out.println("El resultado de la división " + primerValor + " - " + segundoValor + " = "
                                + (primerValor / segundoValor));
                    }
                } else {
                    System.out.println("No es una operación válida");
                }
            }

        } while (!operacion.equals("exit"));

        objScanner.close();
        System.out.println("Programa finalizao con éxito");
    }
}

package dia06;

/*Calculadora */
import java.util.Scanner;

public class TareaCalculadoraSwitch {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        String operacion;
        double valor1;
        double valor2;

        do {
            System.out.println("¿Que operacion desea realizar (+,-,/,* o exit para salir)?");
            operacion = objScanner.nextLine().trim();

            if (operacion.equals("exit")) {
                System.out.println("Programa finalizado con éxito");
            } else {

                System.out.println("Ingresa el primer valor:");
                valor1 = objScanner.nextDouble();

                System.out.println("Ingresar el segundo valor:");
                valor2 = objScanner.nextDouble();

                objScanner.nextLine();

                switch (operacion) {
                    case "+":
                        System.out.println("El resultado de la suma " + valor1 + " + " + valor2 + " = "
                                + (valor1 + valor2));
                        break;

                    case "-":
                        System.out.println("El resultado de la resta " + valor1 + " - " + valor2 + " = "
                                + (valor1 - valor2));
                        break;
                    case "*":
                        System.out.println("El resultado de la multi " + valor1 + " * " + valor2 + " = "
                                + (valor1 * valor2));
                        break;
                    case "/":
                        System.out.println("El resultado de la division " + valor1 + " / " + valor2 + " = "
                                + (valor1 / valor2));
                        break;

                }

            }

        } while (!operacion.equals("exit"));

        objScanner.close();
    }
}

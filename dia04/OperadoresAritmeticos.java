package dia04;

public class OperadoresAritmeticos {
    static String holaMundo = "Hola Mundo!";

    public static void main(String[] args) {
        double valor1 = 10;
        double valor2 = 3;
        double castingNumero = 10.5;

        System.out.println(holaMundo);

        // Suma
        int suma = (int) valor1 + (int) valor2;

        // Resta
        double resta = valor1 - valor2;

        // Multiplicacion
        double multiplicacion = valor1 * valor2;

        // Divisiòn
        double division = valor1 / valor2;

        // Modulo
        double residuo = valor1 % valor2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);
        System.out.println("Casteo de Double a entero: " + (int) castingNumero);
    }
}

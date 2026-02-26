package dia07;

public class Sobrecarga {
    public static int sumar(int a, int b) {
        System.out.println("suma de enteros");
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sumar(5, 3));
        System.out.println(sumar(5.5, 2.3));
        System.out.println(sumar(1, 2, 3));
    }
}

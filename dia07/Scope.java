package dia07;

public class Scope {
    public static void main(String[] args) {
        // System.out.println(numero);
        System.out.println(usarNumero10());
    }

    public static void numeroScope() {
        int numero = 10;
        System.out.println(numero);
    }

    public static int usarNumero10() {
        int numero = 10;
        return numero;
    }
}

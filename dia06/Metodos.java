package dia06;

public class Metodos {

    public static void puedeEntrarAlAntro(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " Si puedes entrar al antro");
        } else {
            System.out.println(nombre + " No puedes entrar al antro");
        }
    }

    public static void metodoConvertirAEntero(String nombre, String edadTexto) {

        if (!edadTexto.matches("\\d+")) {
            System.out.println("Edad inválida para " + nombre);
            return;
        }

        int edad = Integer.parseInt(edadTexto);
        if (edad >= 18) {
            System.out.println(nombre + " Si puedes entrar al antro");
        } else {
            System.out.println(nombre + " No puedes entrar al antro");
        }
    }

    public static void main(String[] args) {
        metodoConvertirAEntero("Sandra", "32");
        metodoConvertirAEntero("Alberto", "38");
        puedeEntrarAlAntro("Karla", 25);
        puedeEntrarAlAntro("Cesar", 25);
        puedeEntrarAlAntro("Miguel", 25);
        puedeEntrarAlAntro("Marco", 17);
        puedeEntrarAlAntro("Marcos", 23);

    }
}

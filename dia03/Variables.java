package dia03;

public class Variables {
    // Altura
    static double altura = 1.65;
    // Precio de un producto
    static double precioRefresco = 25.00;
    // Número de Hijos
    static int numeroHijos = 0;
    // Año de nacimiento
    static int anioNacimiento = 1987;
    // Nùmero de Seguidores
    static int seguidoresRedes = 10000;

    // Altura en Centrimetos
    static int alturaCM = 165;

    // Ejemplo de static
    int marco = 10;

    // Tiene hijos
    static boolean tieneHijos = false;

    // Información de César
    static double alturaCesar = 1.72;
    static double precio = 2506.32;
    static int hijos = 3;
    static int nacimiento = 1978;
    static long seguidores = 563216545;

    // Prueba con caracteres
    static int añonacimiento = 1987;
    static String méxico = "México 86";

    // Variables erroneas
    static int valor1 = 10;
    static int valor2 = 20;

    static int numeroAnimales = valor1 + valor2;

    static int edadMarco = 36;
    static int edadHector = 42;

    public static void main(String[] args) {
        System.out.println("Información Alberto");
        System.out.println("Altura:" + altura);
        System.out.println("Precio Refresco:" + precioRefresco);
        System.out.println("numeroHijos:" + numeroHijos);
        System.out.println("Nacimiento:" + anioNacimiento);
        System.out.println("Seguidores:" + seguidoresRedes);
        System.out.println("Valores alternativos");
        System.out.println("Altura en cm " + alturaCM);
        System.out.println("Tiene hijos " + tieneHijos);
        System.out.println("Información Cesar");
        System.out.println("Altura:" + altura);
        System.out.println("Precio:" + precio);
        System.out.println("Hijos:" + hijos);
        System.out.println("Nacimiento:" + nacimiento);
        System.out.println("Seguidores:" + seguidores);
        System.out.println(precioRefresco);
        System.out.println(añonacimiento);
        System.out.println(méxico);
        System.out.println(numeroAnimales);
        System.out.println(edadMarco);
        System.out.println(edadHector);
    }

}

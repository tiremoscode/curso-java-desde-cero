package dia03;

public class Cadenas {
    static String cadena = "Hola Mundo!";
    static String cadenaLarga = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

    static String frase = "Alumnos del Curso de Java";

    public static void main(String[] args) {
        System.out.println("Cadena de texto: " + cadena);

        // Medir mi cadena
        System.out.println("Mi cadena mide " + cadena.length());
        System.out.println("El lorem mide " + cadenaLarga.length());
        // Volver a mayusculas
        System.out.println(frase.toUpperCase());
        // Volver a minusculas
        System.out.println(frase.toLowerCase());
        // Obtener un caracter en cierta posición
        System.out.println(frase.charAt(3));
    }
}

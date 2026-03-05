package dia11;

public class EjemploTryCatch {
    public static void main(String[] args) {
        String edadTexto = "20a";

        try {
            int edad = Integer.parseInt(edadTexto);
            System.out.println("Edad parseada: " + edad);
        } catch (NumberFormatException e) {
            System.out.println("Error: la edad no es un número válido");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Ocurrio un mensaje de error generico");
            System.out.println(e);
        } finally {
            System.out.println("Fin del intento de parseo del número");
        }
    }
}

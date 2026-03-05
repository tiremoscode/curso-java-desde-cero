package dia11;

public class ValidadordeEdad {
    public static void validarEdad(int edad) {
        if (edad < 0 || edad > 100) {
            throw new EdadInvalidaException("La edad no es valida");
        }
        System.out.println("La edad es valida");
    }
}

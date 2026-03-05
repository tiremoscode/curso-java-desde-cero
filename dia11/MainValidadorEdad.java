package dia11;

public class MainValidadorEdad {
    public static void main(String[] args) {
        try {
            ValidadordeEdad.validarEdad(130);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

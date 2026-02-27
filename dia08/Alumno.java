package dia08;

public class Alumno {
    public static void main(String[] args) {
        // Instanciar a la clase Persona
        // y este será un alumno.

        Persona persona1 = new Persona();
        persona1.edad = 38;
        persona1.nombre = "Alberto";
        persona1.saludar();

        Persona persona2 = new Persona();
        persona2.edad = 27;
        persona2.nombre = "Monica";
        persona2.saludar();

        Perro buttons = new Perro();
        buttons.nombre = "Buttons";
        buttons.edad = 2;
        buttons.color = "Café";

        buttons.presentar();
    }
}

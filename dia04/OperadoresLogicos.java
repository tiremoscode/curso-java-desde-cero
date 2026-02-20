package dia04;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Ejemplo - AND
        // Ambas condiciones se tienen que cumplir.

        int edad = 24;
        boolean tieneCredencialElector = false;

        boolean puedeEntrarAlClub = edad >= 18 && tieneCredencialElector;

        System.out.println("¿Puede entrar al club? " + puedeEntrarAlClub);

        // Ir por tacos
        boolean tengoDinero = true;
        boolean tengoElTiempo = false;

        boolean podemosIrPorTacos = tengoDinero && tengoElTiempo;
        System.out.println("Podemos ir por tacos? " + podemosIrPorTacos);
        // Extra - Operador Ternario
        System.out.println("¿podemos ir por tacos?: " + (podemosIrPorTacos ? "Si " : "No"));

        // Ir por unas chelas, permiso a la esposa.
        // Hora de Regreso
        // ¿Tenemos dinero?

        int horaRegreso = 1;
        boolean tenemosDinero = false;

        System.out.println("¿Podemos ir por chelas hoy? " + (horaRegreso <= 2 && tenemosDinero));

        System.out.println(horaRegreso <= 2 && tenemosDinero);

        System.out.println("Operadores logicos - OR");

        boolean esEstudiante = false;
        boolean esEmpleado = false;
        boolean tengoBeca = true;

        boolean puedeTomarCursoJava = esEstudiante || esEmpleado || tengoBeca;

        System.out.println("¿Puede tomar el curso de Java? " + puedeTomarCursoJava);

        System.out.println("Operadores logicos - NOT!");

        boolean activoClases = true;
        System.out.println("Alumno activo en clases original " + activoClases);
        System.out.println("Alumno activo en clases inverso " + !activoClases);

        if (!(edad >= 18)) {
            System.out.println("No es mayor de edad");
        }

        if (edad < 18) {
            System.out.println("No es mayor de edad");
        }

    }
}

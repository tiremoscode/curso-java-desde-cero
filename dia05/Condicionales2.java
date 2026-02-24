package dia05;

public class Condicionales2 {
    public static void main(String[] args) {
        int numeroAsistenciasClase = 12;

        if (numeroAsistenciasClase >= 14) {
            System.out.println("Entregar diploma Curso Java desde Cero");
        } else if (numeroAsistenciasClase >= 13) {
            System.out.println("Entregar pero con autorización de TG");
        } else if (numeroAsistenciasClase > 10 && numeroAsistenciasClase <= 12) {
            System.out.println("Solo si dirección de TG lo permite");
        } else {
            System.out.println("NO hay diploma para el alumno");
        }
    }
}

package dia05;

public class SwitchModerno {
    public static void main(String[] args) {
        int dia = 8;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Día inválido";
        };

        System.out.println(nombreDia);
    }
}

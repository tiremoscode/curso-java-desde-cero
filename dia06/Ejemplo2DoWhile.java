package dia06;

import java.util.Scanner;

public class Ejemplo2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordCorrecta = "java123";
        String passwordIngresa;

        do {
            System.out.println("Ingresa la contraseña de acceso correcta");
            passwordIngresa = scanner.nextLine();

            if (passwordIngresa.equals(passwordCorrecta)) {
                System.out.println("Bienvenido al Sistema");
            } else {
                System.out.println("   Contraseña incorrecta");
            }

        } while (!passwordIngresa.equals(passwordCorrecta));

        scanner.close();
    }

}
package dia11;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        Set<String> correos = new HashSet<>();

        correos.add("correo1@gmail.com");
        correos.add("correo2@gmail.com");
        correos.add("correo3@gmail.com");
        correos.add("correo1@gmail.com");

        System.out.println(correos);
    }
}
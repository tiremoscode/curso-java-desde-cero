package dia11;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(33);
        numeros.add(20);
        numeros.add(7);

        System.out.println(numeros);

        // Utilizo la Clase Collections y el método sort
        // Collections.sort(numeros);
        // System.out.println(numeros);

        // Utilizo la clase Collections, el método Sort y el método reverseOrder
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);
    }
}

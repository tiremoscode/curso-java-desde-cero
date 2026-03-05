package dia11;

import java.util.ArrayList;

public class ListaDinamica {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        if (nombres.size() > 0) {
            System.out.println("hay al menos un registro en la lista dinamica");
        } else {
            System.out.println("No hay registros en la lista dinamica");
        }

        // Ingreso algunos datos
        nombres.add("Carlos");
        nombres.add("Luis");
        nombres.add("Ricardo");
        nombres.add("Miguel");
        nombres.add("Karla");

        // Imprimir los valores de la lista dinámica
        System.out.println(nombres);

        // Solo traerme los primeros 3 registros de la Lista dinamica
        for (int i = 0; i < 3; i++) {
            System.out.println(nombres.get(i));
        }

        // Eliminar un registro
        nombres.remove("Carlos");

        // Imprimir los valores de la lista dinámica
        System.out.println(nombres);

        // Obtener el primer elemento de la lista dinámica
        System.out.println("Primer elemento de la lista: " + nombres.get(0));

        // ¿Cuantos elementos hay dentro de mi lista dinámica?
        System.out.println("Total de registros en lista dinámica " + nombres.size());

        // ¿Existe un Sandra
        if (nombres.contains("Karla")) {
            System.out.println("Si existe Karla");
        } else {
            System.out.println("No existe Karla");
        }

        // ¿Cómo saber la posición en lista de karla

        int posicion = nombres.indexOf("Pedro");

        if (posicion != -1) {
            System.out.println("Pedro se encuentra en la posición: " + posicion);
        } else {
            System.out.println("Pedro no se encuentra en la lista");
        }

        // Recorrer mi Lista dinámica con un for each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

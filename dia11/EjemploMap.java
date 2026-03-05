package dia11;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        Map<String, Integer> productosSuper = new HashMap<>();

        productosSuper.put("Leche", 2);
        productosSuper.put("Pan", 10);
        productosSuper.put("Cervezas", 2);

        // ¿Cuántas cervezas hay que traer?
        // Esto se determina asignado el valor de la llave
        System.out.println(productosSuper.get("Cervezas"));

        // Imprimir mis productos usando un foreach
        for (Map.Entry<String, Integer> producto : productosSuper.entrySet()) {
            System.out.println(producto.getKey() + " " + producto.getValue());
        }
    }
}

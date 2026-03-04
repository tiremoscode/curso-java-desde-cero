package dia10;

public class Arreglos {
    public static void main(String[] args) {
        int[] edades = new int[3]; // [0,0,0];

        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;

        // Imprimimos la seguna posicion con el valor 20
        System.out.println(edades[1]);

        // For Tradicional / Clasico
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad[" + i + "]= " + edades[i]);
        }

        // For each
        for (int recorrido : edades) {
            System.out.println(recorrido);
        }
    }
}

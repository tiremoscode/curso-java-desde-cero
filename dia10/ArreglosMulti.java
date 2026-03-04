package dia10;

public class ArreglosMulti {
    public static void main(String[] args) {

        // Fila - Izquierda a Derecha
        // Columna - Arriba a Abajo

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(matriz[0][1]);
        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

    }

}

package dia09;

public class MainFiguras {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Azul", 5);
        Figura cuadro = new Cuadrado("Rojo", 10);

        System.out.println("Area del Circulo: " + circulo.calcularArea());
        System.out.println("Area del Cuadrado: " + cuadro.calcularArea());

        circulo.mostrarColorFigura();
        cuadro.mostrarColorFigura();
    }
}

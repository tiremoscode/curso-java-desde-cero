package dia09;

public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        System.out.println("Debug calcularArea Figura");
        return 0;
    }

    public void mostrarColorFigura() {
        System.out.println("El color de la figura es: " + color);
    }
}

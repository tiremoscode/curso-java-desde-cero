package dia09;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // @Override
    public double calcularArea() {
        System.out.println("calcular area sin override");
        return Math.PI * Math.pow(radio, 2);
    }
}

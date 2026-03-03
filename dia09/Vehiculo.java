package dia09;

public class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void encender() {
        System.out.println("El vehiculo está encendido");
    }

    public void apagar() {
        System.out.println("El vehiculo está apagado");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
    }
}

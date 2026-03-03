package dia09;

public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca, int anio, int numeroPuertas) {
        super(marca, anio);
        this.numeroPuertas = numeroPuertas;
    }

    public void tocarClaxon() {
        System.out.println("Beep Beep");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }

}

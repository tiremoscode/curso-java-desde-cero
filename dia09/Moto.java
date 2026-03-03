package dia09;

public class Moto extends Vehiculo {

    private boolean usaCasco;

    public Moto(String marca, int anio, boolean usaCasco) {
        super(marca, anio);
        this.usaCasco = usaCasco;
    }

    public void derraparMoto() {
        System.out.println("La moto se derrapa");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Uso requerido de casco?: " + usaCasco);
    }
}

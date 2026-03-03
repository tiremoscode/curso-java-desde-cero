package dia09;

public class MainVehiculo {
    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", 2025, 4);
        Moto moto = new Moto("Yamaha", 2020, true);

        System.out.println("Información del auto");
        auto.encender();
        auto.mostrarInformacion();
        auto.tocarClaxon();

        System.out.println("Información de la moto");
        moto.encender();
        moto.mostrarInformacion();
        moto.derraparMoto();

    }
}
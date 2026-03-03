package dia09;

public class PagoTarjeta implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta por $ " + monto);
    }
}

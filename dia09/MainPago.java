package dia09;

public class MainPago {
    public static void main(String[] args) {
        Pago pago = new PagoTarjeta();
        pago.procesarPago(500);
    }
}

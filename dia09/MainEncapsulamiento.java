package dia09;

public class MainEncapsulamiento {
    public static void main(String[] args) {
        Encapsulamiento enc = new Encapsulamiento(0);
        enc.setDeposito((100));

        // Consultar el saldo
        System.out.println(enc.getSaldo());

        // Deposito 200
        enc.setDeposito(200);

        // Deposito 100
        enc.setDeposito(100);

        // Consulto el saldo
        System.out.println(enc.getSaldo());

        // Retiro 50
        enc.setRetiro(50);

        // Conulto una vez más el saldo
        System.out.println(enc.getSaldo());

    }
}

package dia08;

public class BBVA {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.ingresarSaldo(100);

        // Deposito
        cuenta.depositarDinero(50);

        // Saldo al momento
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        // Retirar dinero
        cuenta.retirarDinero(120);

        // Saldo al momento después del retiro
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        cuenta.retirarDinero(200);

        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

    }
}

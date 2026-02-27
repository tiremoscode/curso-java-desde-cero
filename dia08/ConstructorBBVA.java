package dia08;

public class ConstructorBBVA {
    public static void main(String[] args) {
        String titular1 = "Alberto";
        double saldo1 = 100;

        // constructor
        ConstructorCtaBancaria ccb = new ConstructorCtaBancaria(titular1, saldo1);

        // Consultar saldo inicial
        ccb.mostrarSaldo();

        // Depositar Dinero
        ccb.depositar(100);

        // Consultar saldo actualizado
        ccb.mostrarSaldo();

        // Retirar 80
        ccb.retirar(80);

        // COnsultar saldo actualizado
        ccb.mostrarSaldo();

    }
}

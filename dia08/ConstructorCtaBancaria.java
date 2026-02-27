package dia08;

public class ConstructorCtaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public ConstructorCtaBancaria(String nombreTitular, double saldoInicial) {
        this.titular = nombreTitular;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Metodo depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("deposito realizado correctamente");
        } else {
            System.out.println(" el monto debe ser mayor a 0");
        }
    }

    // retirar

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("retiro de dinero correctamente");
        } else {
            System.out.println("fondos insuficientes");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Nombre del titular " + titular);
        System.out.println("saldo actual: " + saldo);
    }

}

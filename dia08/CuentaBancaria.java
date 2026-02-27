package dia08;

public class CuentaBancaria {

    double saldo;

    public void ingresarSaldo(double monto) {
        if (monto >= 0) {
            saldo = monto;
        } else {
            System.out.println("Saldo de la persona no puede ser negativo");
            saldo = 0;
        }
    }

    public void depositarDinero(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado correctamente");
        } else {
            System.out.println("El monto debe ser mayor a 0");
        }
    }

    public void retirarDinero(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de dinero correctamente");
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

}

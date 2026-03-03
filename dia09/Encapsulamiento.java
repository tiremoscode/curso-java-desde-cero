package dia09;

public class Encapsulamiento {
    private double saldo;

    public Encapsulamiento(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Get - Obtienen información
    public double getSaldo() {
        return saldo;
    }

    // Set - Asignan información
    public void setDeposito(double cantidad) {
        saldo += cantidad;
    }

    // Set -
    public void setRetiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
}

package ies.puerto;

public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private float saldo;

    /**
     * Constructores
     */
    public CuentaBancaria () {}

    public CuentaBancaria (int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaBancaria (int numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }

    public CuentaBancaria (int numeroCuenta, String nombreTitular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    /**
     * Metodos
     */

    public float depositar (float numeroDepositar) {
        this.saldo += numeroDepositar;
        return this.saldo;
    }

    public float retirar (float numeroRetirar) {
        this.saldo -= numeroRetirar;
        return this.saldo;
    }

    public String mostrarSaldo () {
        return "" + this.saldo;
    }
}

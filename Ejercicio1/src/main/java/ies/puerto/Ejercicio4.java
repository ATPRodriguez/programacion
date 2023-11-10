package ies.puerto;

/**
 * Implementa un programa que gestione las cuentas de un banco, teniendo en cuenta las siguientes consideraciones:
 *     La cuenta de ahorro tendrá las siguientes propiedades:
 *         String titular;
 *         double saldo;
 * Se pide:
 *     Implementa todos los constructores posibles.
 *     Getters/Setters de las propiedades.
 *     Los siguientes métodos:
 *         Depositar un cantidad de dinero.
 *         Retirar una cantidad de dinero.
 *         informacion sobre el titular y la cantidad de dinero que tiene en ese momento en la cuenta.
 */
public class Ejercicio4 {
    private String titular;
    private double saldo;

    /**
     * Constructor por defecto
     */
    public Ejercicio4 () {}

    /**
     * Constructor unicamente con la variable titular
     * @param titular de la cuenta
     */
    public Ejercicio4 (String titular){
        this.titular = titular;
    }

    /**
     * Constructor unicamente con la variable saldo
     * @param saldo de la cuenta
     */
    public  Ejercicio4 (double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor con las variable titular y saldo
     * @param titular de la cuenta
     * @param saldo de la cuenta
     */
    public Ejercicio4(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Getters/Setters
     */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que deposita saldo en la cuenta
     * @param saldoDepositado en la cuenta
     * @return saldo actualizado
     */
    public double depositar(double saldoDepositado) {
        this.saldo += saldoDepositado;
        return this.saldo;
    }

    /**
     * Metodo que retira saldo de la cuenta
     * @param saldoRetirado de la cuenta
     * @return saldo acrtualizado
     */
    public double retirar (double saldoRetirado) {
        this.saldo -= saldoRetirado;
        return this.saldo;
    }

    /**
     * Metodo que imprime la informacion actual de la cuenta
     * @return Titular y saldo actual de la cuenta
     */
    public String imprimir () {
        return "Titular:" + titular + ", Saldo:" + saldo;
    }
}

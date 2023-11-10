package ies.puerto;

public class Circulo {
    private double radio;

    /**
     * Constructores
     */
    public Circulo() {}

    public Circulo (double radio){
        this.radio = radio;
    }

    /**
     * Métodos
     */

    public double calcularArea () {
        double resultado;
        resultado = (Math.PI * (this.radio*this.radio));
        return resultado;
    }

    public double calcularCircunferencia () {
        double resultado;
        resultado = Math.PI * this.radio;
        return resultado;
    }
}

package ies.puerto.utilidades;

public class Calculadora extends UtilidadesCal {
    private int numero1;
    private int numero2;

    public Calculadora () {}

    public Calculadora (int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma () {
        return super.suma(numero1, numero2);
    }

    public int resta () {
        return super.resta(numero1, numero2);
    }

    public float division (){
        return super.division(numero1, numero2);
    }

    public int multiplicacion () {
        return super.multiplicacion(numero1, numero2);
    }
}

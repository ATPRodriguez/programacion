package ies.puerto.utilidades;

public class AppCalculadora {
    static Calculadora calculadora = new Calculadora(9, 3);

    public static void main(String[] args) {
        System.out.println("La suma de " + calculadora.getNumero1() + " y " + calculadora.getNumero2() + " es: " + calculadora.suma());
        System.out.println();

        System.out.println("La resta de " + calculadora.getNumero1() + " y " + calculadora.getNumero2() + " es: " + calculadora.resta());
        System.out.println();

        System.out.println("La division de " + calculadora.getNumero1() + " y " + calculadora.getNumero2() + " es: "
                + calculadora.division());
        System.out.println();

        System.out.println("La multiplicacion de " + calculadora.getNumero1() + " y " + calculadora.getNumero2() + " es: "
                + calculadora.multiplicacion());
    }
}
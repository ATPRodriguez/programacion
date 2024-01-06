package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario
 * es positivo, negativo o cero.
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        float numero = lectura.nextFloat();
        analizar(numero);
    }

    public static void analizar (float numero) {
        if (numero < 0 ) {
            System.out.println(numero + " es negativo");
        } else if (numero > 0) {
            System.out.println(numero + " es positivo");
        } else {
            System.out.println("El numero es 0");
        }
    }
}

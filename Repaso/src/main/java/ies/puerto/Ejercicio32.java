package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un decimal");
        float numero = lectura.nextFloat();
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El numero " + numero +" es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }
}

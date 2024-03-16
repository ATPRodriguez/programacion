package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o decimal)
 * y determine si es divisible por 5.
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        float numero = lectura.nextFloat();
        if(numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5");
        } else {
            System.out.println(numero + " no es divisible por 5");
        }
    }
}

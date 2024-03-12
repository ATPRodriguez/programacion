package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o decimal)
 * y determine si es divisible por 5.
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        float numero = lectura.nextFloat();
        divisiblePor5(numero);
    }

    public static void divisiblePor5 (float numero) {
        if(numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5");
        } else {
            System.out.println(numero + " no es divisible por 5");
        }
    }
}

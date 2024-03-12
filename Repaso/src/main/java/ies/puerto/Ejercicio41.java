package ies.puerto;

import java.util.Scanner;

/**
 *Escribe un programa que compare dos números enteros ingresados por el usuario
 * y muestre cuál es mayor o si son iguales.
 */
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca dos numeros enteros");
        int numero1 = lectura.nextInt();
        int numero2 = lectura.nextInt();
        comparar(numero1, numero2);
    }

    public static void comparar(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else
            System.out.println("Ambos numeros son iguales");
    }
}
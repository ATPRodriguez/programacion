package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero y un número decimal ingresados por el usuario y muestre su suma,
 * considerando conversiones necesarias.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero y un numero decimal");
        int numero1 = lectura.nextInt();
        float numero2 = lectura.nextFloat();
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
    }
}

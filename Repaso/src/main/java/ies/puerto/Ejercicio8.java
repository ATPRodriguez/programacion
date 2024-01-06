package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el radio de un circulo");
        float radio = lectura.nextFloat();
        System.out.println("El area de dicho circulo es: " + (Math.PI * (radio * radio)));
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero y un número decimal ingresados por el usuario,
 * los multiplique y muestre el resultado en una cadena junto con un mensaje.
 */
public class Ejercicio68 {
    public static void main(String[] args) {
        int entero = pedirNumeroEntero();
        float decimal = pedirNumeroDecimal();
        System.out.println("El resultado de: '" + entero + " * " + decimal + "' es '" + (entero*decimal) + "'");
    }

    public static int pedirNumeroEntero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        return lectura.nextInt();
    }

    public static float pedirNumeroDecimal () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero decimal");
        return lectura.nextFloat();
    }
}

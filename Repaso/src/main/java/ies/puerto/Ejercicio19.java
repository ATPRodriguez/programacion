package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario
 * y muestre la concatenación de ambas, así como su longitud.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena1 = lectura.nextLine();
        System.out.println("Introduzca otra cadena");
        String cadena2 = lectura.nextLine();
        String cadenaTotal = cadena1+cadena2;
        System.out.println("La concatenacion de " + cadena1 + " y " + cadena2 + " es: " + cadenaTotal + " y tiene " + cadenaTotal.length() + " caracteres");
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena = lectura.nextLine();
        System.out.println("Introduzca otra cadena");
        String cadena2 = lectura.nextLine();
        if(cadena.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud");
        } else {
            System.out.println("Las cadenas tienen distinta longitud");
        }
    }
}

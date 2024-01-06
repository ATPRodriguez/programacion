package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que incluya un bucle while que se ejecute infinitamente.
 * Asegúrate de proporcionar una condición de salida adecuada.
 */
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un numero");
            lectura.nextInt();
        }
    }
}

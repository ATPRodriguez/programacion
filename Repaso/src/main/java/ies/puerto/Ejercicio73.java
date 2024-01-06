package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome una cadena ingresada por el usuario
 * y cuente cuántas vocales (a, e, i, o, u) contiene. Utiliza un bucle while.
 */
public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena = lectura.nextLine();
        int contador = 0;
        int i = 0;
        while (i < cadena.length()) {
            if (esVocal(cadena.charAt(i))) {
                contador++;
            }
            i++;
        }
        System.out.println("La cadena ingresada tiene " + contador + " vocales");
    }

    public static boolean esVocal(char caracter) {
        String vocales = "aeiouAEIOU";
        int i = 0;
        while (i < vocales.length()) {
            if (vocales.charAt(i) == caracter) {
                return true;
            }
            i++;
        }
        return false;
    }
}

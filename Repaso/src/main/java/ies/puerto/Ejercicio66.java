package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que tome una frase y una palabra ingresada por el usuario,
 * luego determine si la palabra está contenida en la frase.
 */
public class Ejercicio66 {
    public static void main(String[] args) {
        String frase = pedirFrase();
        String palabra = pedirPalabra();
        contiene(frase, palabra);
    }

    public static String pedirFrase () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        return lectura.nextLine();
    }

    public static String pedirPalabra () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        return lectura.next();
    }

    public static void contiene (String frase, String palabra) {
        if (frase.contains(palabra)) {
            System.out.println("La frase '" + frase + "' contiene la palabra '" + palabra + "'");
        } else {
            System.out.println("La frase '" + frase + "' no contiene la palabra '" + palabra + "'");
        }
    }
}

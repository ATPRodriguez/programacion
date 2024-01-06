package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un carácter ingresado por el usuario
 * y determine si es una vocal o una consonante.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un caracter (si introduce una cadena solo contara el primer caracter)");
        String cadena = lectura.nextLine();
        char caracter = cadena.charAt(0);
        String vocales = "aeiouAEIOU";
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        boolean vocal = false;
        boolean consonante = false;
        int i = 0;
        while (i < vocales.length()) {
            if (vocales.charAt(i) == caracter) {
                vocal = true;
                break;
            }
            i++;
        }
        if (!vocal) {
            i = 0;
            while (i < consonantes.length()) {
                if (consonantes.charAt(i) == caracter) {
                    consonante = true;
                    break;
                }
                i++;
            }
        }

        if (vocal) {
            System.out.println(caracter + " es una vocal");
        } else if (consonante){
            System.out.println(caracter + " es una consonante");
        } else {
            System.out.println(caracter + " no es una letra");
        }
    }
}

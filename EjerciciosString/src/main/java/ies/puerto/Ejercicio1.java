package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena de texto e imprima su longitud.
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String cadena = lectura.nextLine();
        System.out.println("La longitud de la cadena es de " + cadena.length());
    }
}
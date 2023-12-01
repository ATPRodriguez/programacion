package ies.puerto;

import java.util.Locale;

/**
 * Implementa un programa que convierta una cadena de texto a minúsculas y otra a mayúsculas.
 * @author ATPRodriguez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena1 = "Omniscient Reader";
        String cadena2 = "The Legend of the Galactic Hero";
        System.out.println(cadena1);
        System.out.println(cadena2);
        cadena1 = cadena1.toUpperCase();
        cadena2 = cadena2.toLowerCase();
        System.out.println(cadena1);
        System.out.println(cadena2);
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos cadenas ingresadas por el usuario y determine si son iguales o diferentes.
 */
public class Ejercicio60 {
    public static void main(String[] args) {
        String cadena1 = pedirCadena();
        String cadena2 = pedirCadena();
        compararCadenas(cadena1, cadena2);
    }

    public static String pedirCadena () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        return lectura.nextLine();
    }

    public static void compararCadenas (String cadena1, String cadena2){
        cadena1 = cadena1.trim();
        cadena2 = cadena2.trim();
        if (cadena1.length() == cadena2.length()) {
            boolean iguales = true;
            int i = 0;
            while (i < cadena1.length()) {
                if (cadena1.charAt(i) != cadena2.charAt(i)) {
                    iguales = false;
                    break;
                }
                i++;
            }
            if (iguales) {
                System.out.println("Ambas cadenas son iguales");
            } else {
                System.out.println("Las cadenas son distintas");
            }
        } else {
            System.out.println("Las cadenas son distintas");
        }
    }
}

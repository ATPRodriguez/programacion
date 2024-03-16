package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario
 * y verifique si contiene la letra 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena = lectura.nextLine();
        int i = 0;
        while (i < cadena.length()){
            if (cadena.charAt(i) == 'a') {
                System.out.println("La cadena " + cadena + " contiene la letra 'a'");
                break;
            }
            i++;
        }
        if (i == cadena.length()) {
            System.out.println("La cadena " + cadena + " no contiene la letra 'a'");
        }
    }
}

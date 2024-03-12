package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.
 * @author ATPRodriguez
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Inserte una frase");
        String frase = lectura.nextLine();
        String palabraActual = "";

        for (int i = 0; i < frase.length(); i++) {
            char caracterActual = frase.charAt(i);

            if (caracterActual != ' ') {
                palabraActual += caracterActual;
            } else if (!palabraActual.isEmpty()) {
                System.out.println(palabraActual);
                palabraActual = "";
            }
        }
        if (!palabraActual.isEmpty()) {
            System.out.println(palabraActual);
        }
    }
}

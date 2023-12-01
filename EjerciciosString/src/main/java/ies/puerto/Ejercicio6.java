package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.
 * @author ATPRodriguez
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String frase = lectura.nextLine();
        int inicio = 0;
        int contador = 0;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                contador++;
            } else {
                System.out.println(frase.substring(inicio, contador));
            }
        }
    }
}

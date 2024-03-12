package ies.puerto;

/**
 * @author Alejandro Tomas
 * 1. Escribe un programa en Java que imprima el patrón siguiente:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class PiramideNumeros {
    public static void main(String[] args) {

        int numero= 1;

        for (int i = 1; i < 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(numero++ + " ");
            }
            System.out.println();
        }
    }
}
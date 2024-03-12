package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que busque el número máximo en una matriz de 4x4 y muestre su posición.
 */
public class Ejercicio89 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},{8,7,6,5},{20,24,30,28},{50,40,30,20}};
        buscarmayor(matriz);
    }

    public static void buscarmayor(int[][] matriz) {
        int mayor = matriz[0][0];
        String posicion = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    posicion = i + "," + j;
                }
            }
        }
        System.out.println("El mayor numero de la matriz es " + mayor + " y esta en la posicion: " + posicion);
    }
}

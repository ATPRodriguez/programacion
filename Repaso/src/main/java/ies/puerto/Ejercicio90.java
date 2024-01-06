package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que rote una matriz de 3x3, 90º grados en sentido antihorario.
 */
public class Ejercicio90 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
            rotarMatriz(matriz);
            imprimirMatriz(matriz);
        }

        public static void rotarMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = i ; j < matriz[0].length; j++) {
                    int auxiliar = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = auxiliar;
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                    int auxiliar = matriz[i][0];
                    matriz[i][0] = matriz[i][matriz.length - 1];
                    matriz[i][matriz.length - 1] = auxiliar;
                }
        }

        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

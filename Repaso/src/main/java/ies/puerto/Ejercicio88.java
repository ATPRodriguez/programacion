package ies.puerto;

/**
 * Escribe un programa que multiplique dos matrices de dimensiones 2x3 y 3x2, y muestre el resultado.
 */
public class Ejercicio88 {
    public static void main(String[] args) {
        int[][] matriz1 = {{2,3,5},{7,2,4}};
        int[][] matriz2 = {{1,6},{7,2},{0,-5}};
        int[][] resultado = multiplicar(matriz1, matriz2);
        imprimirMatriz(resultado);
    }

    public static int[][] multiplicar(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    public static void imprimirMatriz (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
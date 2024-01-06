package ies.puerto;

/**
 * Crea un programa que tome una matriz de 3x3 y calcule su transpuesta.
 */
public class Ejercicio87 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrizTranspuesta = calcularTranspuesta(matriz);
        imprimirMatriz(matrizTranspuesta);
    }

    public static int[][] calcularTranspuesta (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[0].length; j++) {
                int auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        return matriz;
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

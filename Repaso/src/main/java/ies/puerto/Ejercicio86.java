package ies.puerto;

/**
 * Desarrolla un programa que sume dos matrices de 3x3 y muestre el resultado.
 */
public class Ejercicio86 {
    public static void main(String[] args) {
        int[][] matriz1 = {{4,7,10},{2,5,2},{15,6,9}};
        int[][] matriz2 = {{9,8,7},{12,5,20},{14,20,11}};
        int[][] matrizResultado = hacerSuma(matriz1, matriz2);
        imprimirMatriz(matrizResultado);
    }

    public static int[][] hacerSuma (int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[3][3];
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[0].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
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

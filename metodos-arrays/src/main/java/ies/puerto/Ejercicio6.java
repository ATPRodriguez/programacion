package ies.puerto;

public class Ejercicio6 {
    public int[][] matrizTranspuesta (int[][] numeros) {
        int filas = numeros.length;
        int columnas = numeros[0].length;
        int[][] numerosTranspuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++){
                numerosTranspuesta[i][j] = numeros[j][i];
            }
        }
        return numerosTranspuesta;
    }
}

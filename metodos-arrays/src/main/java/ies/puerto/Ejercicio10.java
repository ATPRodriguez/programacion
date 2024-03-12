package ies.puerto;

public class Ejercicio10 {
    public boolean matrizDiagonal (int [][] numeros){
        int filas = numeros.length;
        int columnas = numeros[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if (i != j && numeros[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}

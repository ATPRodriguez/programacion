package ies.puerto;

public class Ejercicio5 {

    public static void main (String[] args){
        crearMatriz();
    }

    public static void crearMatriz () {
        int [][] matriz = new int[5][5];

        for (int i = 0; i< matriz.length; i++){
            matriz[i][i] = 1;
        }
    }
}

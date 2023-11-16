package ies.puerto;

public class Ejercicio6 {
    public static void main (String[] args) {
        int[][] cuadro = new int[5][15];
        borde(cuadro);
        imprimir (cuadro);
    }

    public static void borde (int[][] cuadro){
        for (int i = 0; i < cuadro.length; i++){
            if (i == 0 || i == cuadro.length-1)
                cuadro[i][0] = 1;
            for (int j = 0; j < cuadro[i].length; j++){
                if (j == 0 || j == cuadro.length-1)
                    cuadro[i][j] = 1;
            }
        }
    }

    public static void imprimir (int[][] cuadro){
        for (int i = 0; i < cuadro.length; i++){
            for (int j = 0; j < cuadro[0].length; j++){
                System.out.print("" + cuadro[i][j]);
            }
            System.out.println();
        }
    }
}

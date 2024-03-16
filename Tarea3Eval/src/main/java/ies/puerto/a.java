package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio que escribe un triangulo equilatero
 * @author Alejandro Tomas Pacheco Rodriguez
 */
public class a {
    public static void main(String[] args) {
        int filas;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas");
        filas = lectura.nextInt();
        if (filas <= 0)
            System.out.println("El numero de filas debe ser positivo");
        else
            escribirTriangulo(crearTriangulo(filas));
    }

    /**
     * Metodo que crea el triangulo equilatero
     * @param filas del triangulo
     * @return triangulo
     */
    public static String[][] crearTriangulo(int filas) {
        String[][] triangulo = new String[filas + 1][filas + filas - 1];
        int limiteDerecho = filas + filas -1; 
        int limiteIzquierdo = 0;
        for (int i = filas; i > 0; i--) {
            for (int j = limiteIzquierdo; j < limiteDerecho; j++){
                triangulo[i][j] = ""+1;
            }
            limiteDerecho--;
            limiteIzquierdo++;
        }
        return triangulo;
    }

    /**
     * Metodo que escribe el triangulo
     * @param triangulo a escribir
     */
    public static void escribirTriangulo (String[][] triangulo) {
        for (int i = 0; i < triangulo.length; i++){
            for (int j = 0; j < triangulo[i].length; j++) {
                if (triangulo[i][j] == null)
                    triangulo[i][j] = " ";
                System.out.print(triangulo[i][j] + "");
            }
            System.out.println();
        }
    }
}
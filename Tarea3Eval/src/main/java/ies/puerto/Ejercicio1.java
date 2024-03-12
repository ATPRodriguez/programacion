package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio que escribe un triangulo equilatero
 * @author Alejandro Tomas Pacheco Rodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int columnas;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas");
        columnas = lectura.nextInt();
        if (columnas < 4) {
            throw new IllegalArgumentException("EL valor no puede ser inferior a 4");
        }
        escribirTriangulo(crearTriangulo(columnas));
        escribirTriangulo(crearTrianguloInverso(columnas));
        escribirTriangulo(crearTriangulo(columnas));
    }

    /**
     * Metodo que crea el triangulo invertido
     * @param filas del triangulo
     * @return triangulo
     */
    public static String[][] crearTrianguloInverso(int filas) {
        String[][] triangulo = new String[filas - 1][filas + filas - 1];
        int limiteDerecho = filas + filas - 1;
        int limiteIzquierdo = 0;
        for (int i = 0; i <= filas; i++) {
            for (int j = limiteIzquierdo + 1; j < limiteDerecho -1; j++) {
                triangulo[i][j] = "" + 1;
            }
            limiteDerecho--;
            limiteIzquierdo++;
        }
        return triangulo;
    }

    public static String[][] crearTriangulo(int filas) {
        String[][] triangulo = new String[filas][filas + filas - 1];
        int limiteDerecho = filas + filas - 1;
        int limiteIzquierdo = 0;
        for (int i = filas -1 ; i >= 0; i--) {
            for (int j = limiteIzquierdo; j < limiteDerecho; j++) {
                triangulo[i][j] = "" + 1;
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
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                if (triangulo[i][j] == null)
                    triangulo[i][j] = " ";
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
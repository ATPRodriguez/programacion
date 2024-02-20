package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el numero de columnas del triangulo inverso");
        int filas = lectura.nextInt();
        verificarFilas(filas);
        String[][] trianguloInverso = crearTrianguloInvertido(filas);
        String[][] triangulo = crearTriangulo(filas);
        escribirTriangulo(triangulo);
        escribirTriangulo(trianguloInverso);
    }

    /**
     * Funcion que verifica que haya mas de 3 filas
     * @param filas a comprobar
     * @return true si columnas >= 4
     */
    public static boolean verificarFilas(int filas) {
        if (filas < 4) {
            throw new IllegalArgumentException("El valor introducido no puede ser inferior a 4");
        }
        return true;
    }

    /**
     * Funcion que crea un triangulo equilatero invertido en una matriz
     * @param filas del triangulo
     * @return matriz del triangulo
     */
    public static String[][] crearTrianguloInvertido(int filas) {
        if (filas % 2 == 0) {
            filas++;
        }
        String[][] triangulo = new String[filas][filas];
        int limiteDerecho = filas;
        for (int i = 0; i < filas; i++) {
            for (int j = i; j < limiteDerecho; j++) {
                triangulo[i][j] = "*";
            }
            limiteDerecho--;
        }
        return triangulo;
    }

    /**
     * Funcion que crea un triangulo equilatero en una matriz
     * @param columnas del triangulo
     * @return matriz del triangulo
     */
    public static String[][] crearTriangulo(int columnas) {
        if (columnas % 2 == 0) {
            columnas++;
        }
        String[][] triangulo = new String[(columnas+1)/2][columnas];
        int limiteIzquierdo = 0;
        int limiteDerecho = columnas;
        for (int i = triangulo.length-1; i >= 0; i--) {
            for (int j = limiteIzquierdo+1; j < limiteDerecho-1; j++) {
                triangulo[i][j] = "*";
            }
            limiteIzquierdo++;
            limiteDerecho--;
        }
        return triangulo;
    }

    /**
     * Funcion que escribe el triangulo almacenado en la matriz
     * @param triangulo a escribir
     */
    public static void escribirTriangulo (String[][] triangulo) {
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++){
                if (triangulo[i][j] == null) {
                    triangulo[i][j] = " ";
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}

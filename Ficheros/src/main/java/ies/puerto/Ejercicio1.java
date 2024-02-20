package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 1: Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido.
 * El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error.
 * Puntuación máxima dos puntos.
 * La salida para una entrada de 6, o 7 columnas debe ser la siguiente:
 *           * * * * * * *
 *             * * * * *
 *               * * *
 *                 *
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el numero de columnas del triangulo inverso");
        int columnas = lectura.nextInt();
        verificarColumnas(columnas);
        String[][] trianguloInverso = crearTrianguloInvertido(columnas);
        escribirTriangulo(trianguloInverso);
    }

    /**
     * Funcion que verifica que haya mas de 3 columnas
     *
     * @param columnas a comprobar
     * @return true si columnas >= 4
     */
    public static boolean verificarColumnas(int columnas) {
        if (columnas < 4) {
            throw new IllegalArgumentException("El valor introducido no puede ser inferior a 4");
        }
        return true;
    }

    /**
     * Funcion que crea un triangulo equilatero invertido en una matriz
     *
     * @param columnas del triangulo
     * @return matriz del triangulo
     */
    public static String[][] crearTrianguloInvertido(int columnas) {
        if (columnas % 2 == 0) {
            columnas++;
        }
        String[][] triangulo = new String[(columnas + 1) / 2][columnas];
        int limiteDerecho = columnas;
        for (int i = 0; i < columnas; i++) {
            for (int j = i; j < limiteDerecho; j++) {
                triangulo[i][j] = "*";
            }
            limiteDerecho--;
        }
        return triangulo;
    }

    /**
     * Funcion que escribe el triangulo almacenado en la matriz
     *
     * @param triangulo a escribir
     */
    public static void escribirTriangulo(String[][] triangulo) {
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                if (triangulo[i][j] == null) {
                    triangulo[i][j] = " ";
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
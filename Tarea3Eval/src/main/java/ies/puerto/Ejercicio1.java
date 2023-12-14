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
    }

    /**
     * Metodo que crea el triangulo invertido
     * @param columnas del triangulo
     * @return triangulo
     */
    public static String[][] crearTriangulo(int columnas) {
        if (columnas % 2 == 0) {
            columnas += 1;
        }
        String[][] triangulo = new String[columnas + 1][columnas];
        int limiteDerecho = triangulo.length - 1;
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = i; j < limiteDerecho; j++){
                triangulo[i][j] = ""+1;
            }
            limiteDerecho--;
        }
        return triangulo;
    }

    /**
     * Metodo que escribe el triangulo
     * @param triangulo a escribir
     */
    public static void escribirTriangulo (String[][] triangulo) {
        for (int i = 0; i < triangulo.length / 2; i++){
            for (int j = 0; j < triangulo[i].length; j++) {
                if (triangulo[i][j] == null)
                    triangulo[i][j] = " ";
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
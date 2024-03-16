package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que utilice un bucle for para imprimir un triángulo de asteriscos,
 * donde la base del triángulo es ingresada por el usuario.
 */
public class Ejercicio74 {
    public static void main(String[] args) {
        int filas = pedirFilas();
        dibujarTriangulo(filas);
    }

    public static int pedirFilas () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca las filas del triangulo");
        return lectura.nextInt();
    }

    public static void dibujarTriangulo (int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

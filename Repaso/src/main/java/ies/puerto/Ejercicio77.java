package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar cinco notas y calcule el promedio utilizando un bucle for.
 */
public class Ejercicio77 {
    public static void main(String[] args) {
        float promedio = 0;
        for (int i = 0; i < 5; i++) {
            promedio += pedirNota();
        }
        System.out.println("El promedio segun sus notas es: " + promedio/5);
    }

    public static float pedirNota() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        return lectura.nextFloat();
    }
}

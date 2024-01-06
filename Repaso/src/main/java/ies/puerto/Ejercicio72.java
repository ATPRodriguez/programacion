package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar cinco números
 * y calcule el producto de esos números utilizando un bucle for.
 */
public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int producto = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un numero");
            producto *= lectura.nextInt();
        }
        System.out.println("El producto de los 5 numeros introducidos es " + producto);
    }
}

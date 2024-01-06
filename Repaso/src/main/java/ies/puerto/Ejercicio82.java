package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrolla un programa que ordene un array de enteros en orden ascendente y luego lo muestre.
 * Solicita el tamaño del array, e introduce los valores.
 */
public class Ejercicio82 {
    public static void main(String[] args) {
        int[] array = crearLlenarArray();
        Arrays.sort(array);
        mostrarArray(array);
    }

    public static int[] crearLlenarArray () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array");
        int tamanio = lectura.nextInt();
        int[] array = new int[tamanio];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca el valor para el array en la posicion " + i);
            array[i] = lectura.nextInt();
        }
        return array;
    }

    public static void mostrarArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}

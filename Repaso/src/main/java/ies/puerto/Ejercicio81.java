package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que sume todos los elementos de un array de enteros y muestre el resultado.
 * Solicita el tamaño del array, e introduce los valores, para ejecutar la suma.
 */
public class Ejercicio81 {
    public static void main(String[] args) {
        int[] array = crearLlenarArray();
        realizarSuma(array);
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
    public static void realizarSuma (int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        System.out.println("La suma de todos los valores del array es " + suma);
    }
}

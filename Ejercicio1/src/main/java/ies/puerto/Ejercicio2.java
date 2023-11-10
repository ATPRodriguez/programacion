package ies.puerto;

import java.util.Arrays;

/**
 *Implementa el algoritmo de ordenamiento de burbuja para ordenar un array de números enteros.
 * _El ordenamiento de burbuja es un algoritmo de ordenamiento simple que funciona comparando repetidamente pares de elementos adyacentes
 * y intercambiándolos si están en el orden incorrecto.
 * Este proceso se repite hasta que no se requieren más intercambios, lo que indica que el array está ordenado:
 * Pasos:
 * El ordenamiento de burbuja sigue estos pasos:
 *     Comparación de Elementos:
 *         Compara cada par de elementos adyacentes en el array.
 *     Intercambio de Elementos:
 *         Si los elementos están en el orden incorrecto, los intercambia.
 *     Repetición:
 *         Repite los pasos 1 y 2 para cada elemento en el array.
 *     Iteraciones:
 *         Repite tod0 el proceso para un numero de iteraciones igual al tamanio del array.
 *     Array Ordenado:
 *         El array está ordenado cuando no se realizan más intercambios en una iteración completa.
 */
public class Ejercicio2 {
    public int[] ordenamientoBurbuja(int[] array) {
        int apoyo = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < apoyo ; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
                apoyo = apoyo - 1;
        } while (swapped);
        return array;
    }
}
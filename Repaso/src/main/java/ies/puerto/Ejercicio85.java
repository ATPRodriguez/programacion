package ies.puerto;

/**
 * Escribe un programa que cuente cuántas veces aparece un número específico en un array de enteros.
 */
public class Ejercicio85 {
    public static void main(String[] args) {
        int[] array = {0,1,1,2,3,5,8,13,21,34,2,3,1,4,10,20};
        int numero = 1;
        contarNumero(array, numero);
    }
    public static void contarNumero (int[] array, int numero) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                contador++;
            }
        }
        System.out.println("El numero " + numero + " aparece " + contador + " veces en el array");
    }
}

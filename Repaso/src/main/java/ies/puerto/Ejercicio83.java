package ies.puerto;

/**
 * Crea un programa que busque un número específico en un array y muestre su posición si se encuentra,
 * o un mensaje indicando que no se encontró.
 * >Nota: Definir e introducir valores lo has realizado en el ejercicio anterior_.
 */
public class Ejercicio83 {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50};
        int numero = 20;
        buscarNumero(array, numero);
    }

    public static void buscarNumero(int[] array, int numero) {
        int i = 0;
        boolean encontrado = false;
        while (i < array.length) {
            if (array[i] == numero) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("El numero " + numero + " ha sido encontrado en la posicion " + (i+1) + " (contando la primera posicion como '1')");
        } else {
            System.out.println("No se encontró el numero " + numero + " en el array");
        }
    }
}

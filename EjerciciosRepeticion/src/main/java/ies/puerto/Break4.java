package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número negativo en un array, utilizando break.
 */
public class Break4 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5,6,7};
        int i = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                System.out.println("El array contiene un numero negativo");
                break;
            }
            i++;
        }
    }
}
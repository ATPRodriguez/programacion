package ies.puerto;

/**
 * Escribe un programa que busque el número 7 en un array, utilizando break.
 */
public class Break3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int i = 0;
        while (i < array.length) {
            if (array[i] == 7) {
                System.out.println("El numero 7 ha sido encontrado");
                break;
            }
            i++;
        }
    }
}
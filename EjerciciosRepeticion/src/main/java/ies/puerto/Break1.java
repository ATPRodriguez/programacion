package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Break1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <=100) {
            if ((i % 5 == 0) && (i %7 == 0)) {
                System.out.println("El primer numero divisible entre 5 y 7 es: " + i);
                break;
            }
            i++;
        }
    }
}
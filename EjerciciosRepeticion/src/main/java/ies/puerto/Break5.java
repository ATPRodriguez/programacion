package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break.
 */
public class Break5 {
    public static void main(String[] args) {
        int i = 31;
        boolean encontrado = false;
        do {
            if (i % 5 == 0){
                break;
            }
            i++;
        } while (true);
        System.out.println("El primer numero divisible entre 5 superior a 30 es: "+ i);
    }
}
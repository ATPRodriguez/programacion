package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 */
public class Break2 {
    public static void main(String[] args) {
        int numero = 100;
        while (true) {
            if (esPrimo(numero))
                break;
            numero++;
        }
        System.out.println("El primer numero primo mayor que 100 es " + numero);
    }

    public static boolean esPrimo (int numero) {
        int i = 2;
        while (i < numero) {
            if (numero % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
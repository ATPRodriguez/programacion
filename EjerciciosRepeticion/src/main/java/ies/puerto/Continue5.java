package ies.puerto;

/**
 * Escribe un programa que imprima todos los números positivos en un array, usando continue para omitir los números negativos
 */
public class Continue5 {
    public static void main(String[] args) {
        int[] numeros = {-2, 5, -8, 10, 15, -3, 7};
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < 0)
                continue;
            System.out.print(numeros[i] + " ");
        }
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > 0)
                System.out.print(numeros[i] + " ");
        }
    }
}

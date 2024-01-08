package ies.puerto;

/**
 * Escribe un programa que busque y cuente los números mayores que 50 en un array,
 * usando continue para omitir los números menores o iguales a 50.
 */
public class Continue4 {
    public static void main(String[] args) {
        int[] numeros = {40, 60, 30, 80, 50, 45, 70};
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] <= 50)
                continue;
            System.out.print(numeros[i] + " ");
        }
    }
}
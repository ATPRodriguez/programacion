package ies.puerto;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto
 * @author ATPRodriguez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "En un lugar de la mancha";
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            int j = 0;
            while (j < vocales.length) {
                if (cadena.charAt(i) == vocales[j]) {
                    contador++;
                    break;
                }
                j++;
            }
        }
        System.out.println("Existen un total de " + contador + " vocales.");
    }
}

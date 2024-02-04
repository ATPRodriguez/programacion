package ies.puerto;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 * Puntuación 1 punto.
 * Con test que verifique el comportamiento 1,25).
 * @author ATPRodriguez
 */
public class Ejercicio2 {
    public int contarVocales (String cadena) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            int j = 0;
            while (j < vocales.length) {
                if (cadena.charAt(i) == vocales[j]){
                    contador++;
                }
                j++;
            }
        }
        return contador;
    }
}

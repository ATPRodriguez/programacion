package ies.puerto;

/**
 * Desarrolla un programa que elimine los espacios en blanco al principio y al final de una cadena de texto.
 * @author ATPRodriguez
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = "        Omniscient Reader            ";
        frase = frase.trim();
        System.out.println(frase);
    }
}

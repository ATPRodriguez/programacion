package ies.puerto;

/**
 * Implementa un programa que invierta una cadena de texto dada.
 * @author ATPRodriguez
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena1 = "En un lugar de La Mancha";
        String cadena2 = "";

        for (int i = cadena1.length()-1; i >= 0; i--) {
            char caracter1 = cadena1.charAt(i);
            cadena2 += caracter1;
        }

        System.out.println("Cadena 1:" + cadena1);
        System.out.println("Cadena invertida:" + cadena2);
    }
}

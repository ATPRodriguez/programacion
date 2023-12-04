package ies.puerto;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 * @author ATPRodriguez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "En un lugar de La Mancha";
        char letra = 'n';
        String cadena2 = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != letra) {
                cadena2 += cadena.charAt(i);
            } else {
                cadena2 += '_';
            }
        }
        cadena = cadena2;

        System.out.println(cadena);
    }
}

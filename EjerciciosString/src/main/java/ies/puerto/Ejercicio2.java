package ies.puerto;

/**
 * Escribe un programa que compare dos cadenas de texto e indique si son iguales o diferentes.
 * @author ATPRodriguez
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena1 = "En un lugar de La Mancha";
        String cadena2 = "En un pais multicolor";
        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}

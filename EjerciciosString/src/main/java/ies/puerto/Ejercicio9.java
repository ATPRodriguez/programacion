package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena específica.
 * @author ATPRodriguez
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String cadena = lectura.nextLine();
        boolean comienzaCon = cadena.startsWith("Fel");
        boolean terminaCon = cadena.endsWith("dad");
        System.out.println("Empieza con Fel? " + comienzaCon);
        System.out.println("Acaba con dad? " + terminaCon);
    }
}

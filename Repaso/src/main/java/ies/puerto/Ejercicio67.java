package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número decimal,
 * lo convierta a una cadena y muestre cuántos dígitos tiene después del punto decimal.
 */
public class Ejercicio67 {
    public static void main(String[] args) {
        String cadena = String.valueOf(pedirNumero());
        System.out.println(cadena + " tiene " + contarDecimales(cadena) + " digitos despues del punto decimal");
    }

    public static double pedirNumero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero decimal");
        return lectura.nextDouble();
    }

    public static int contarDecimales (String cadena) {
        boolean decimal = false;
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '.') {
                decimal = true;
                i++;
            }
            if (decimal) {
                contador++;
            }
        }
        return contador;
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número ingresado como cadena
 * y lo convierta a un valor entero, luego multiplícalo por 2 y muestra el resultado.
 */
public class Ejercicio64 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(pedirNumero());
        System.out.println(numero * 2);
    }

    public static String pedirNumero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        return lectura.nextLine();
    }
}

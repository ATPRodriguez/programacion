    package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que convierta un número entero en una cadena de texto
 * y viceversa utilizando los métodos de la clase Integer.
 * @author ATPRodriguez
 */
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Integer numero = 143;
        String numeroStr = "431";
        int numeroCadena = Integer.parseInt(numeroStr);
        String numeroInteger = numero.toString();
        System.out.println("Cadena: " + numeroCadena + ", Integer: " + numeroInteger);
    }
}
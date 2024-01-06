package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar números con un bucle while
 * y calcule la suma de esos números. Termina el bucle cuando la suma alcance o supere 100.
 */
public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int suma = 0;
        while (suma < 100) {
            System.out.println("Ingrese un numero");
            suma += lectura.nextInt();
            System.out.println("Suma actual: " + suma);
        }
    }
}

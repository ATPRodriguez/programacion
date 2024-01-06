package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero ingresado por el usuario,
 * lo convierta a un valor double y muestre la raíz cuadrada de ese número.
 */
public class Ejercicio65 {
    public static void main(String[] args) {
        int numero = pedirNumero();
        double numeroDecimal = numero;
        System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numeroDecimal));
    }

    public static int pedirNumero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        return lectura.nextInt();
    }
}

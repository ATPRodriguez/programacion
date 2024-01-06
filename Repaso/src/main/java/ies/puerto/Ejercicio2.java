package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario su nombre y luego muestre "¡Hola, [nombre]!", donde [nombre] es el nombre proporcionado por el usuario.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca su nombre por favor");
        String nombre = lectura.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}
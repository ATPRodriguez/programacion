package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome tu nombre y apellido ingresados por separado
 * y muestre tu nombre completo en una sola línea.
 */
public class Ejercicio63 {
    public static void main(String[] args) {
        String nombre = pedirNombre();
        String apellido = pedirApellido();
        System.out.println(nombre + " " + apellido);
    }

    public static String pedirNombre () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        return lectura.nextLine();
    }

    public static String pedirApellido () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su apellido");
        return lectura.nextLine();
    }
}

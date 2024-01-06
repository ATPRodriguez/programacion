package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca su nombre por favor");
        String nombre = lectura.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}
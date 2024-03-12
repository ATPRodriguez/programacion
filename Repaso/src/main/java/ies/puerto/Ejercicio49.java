package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
 */
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = lectura.nextInt();
        comprobarEdad(edad);
    }

    public static void comprobarEdad (int edad) {
        if (edad < 18) {
            System.out.println("Usted tiene menos de 18 anios");
        } else if (edad <= 65) {
            System.out.println("Usted tiene entre 18 y 65 anios");
        } else {
            System.out.println("Usted tiene mas de 65 anios");
        }
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que simule un juego de adivinanza. Elige un número aleatorio entre 1 y 10 y pide al usuario que adivine.
 * Utiliza un bucle do-while para continuar el juego hasta que el usuario adivine el número.
 */
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numeroCorrecto = 9;
        int respuesta = 0;
        do {
            System.out.println("Introduzca un numero del 1 al 10");
            respuesta = lectura.nextInt();
            if (respuesta < 1 || respuesta > 10) {
                System.out.println("El numero debe ser superior a 1 e inferior a 10");
            } else if (respuesta != numeroCorrecto) {
                System.out.println("Ese numero no es");
            }
        } while (respuesta != numeroCorrecto);
        System.out.println("Has adivinado el numero");
    }
}

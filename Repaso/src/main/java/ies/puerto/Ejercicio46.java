package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
 * Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una temperatura");
        float temperatura = lectura.nextFloat();
        comprobarTemperatura(temperatura);
    }

    public static void comprobarTemperatura (float temperatura) {
        final float maximoPermitido = 20f;
        if (temperatura <= maximoPermitido) {
            System.out.println(temperatura + " está dentro del rango permitido");
        } else {
            System.out.println(temperatura + " supera el rango permitido.");
        }
    }
}

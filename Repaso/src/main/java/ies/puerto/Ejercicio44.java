package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que determine si una variable booleana ingresada por el usuario
 * es verdadera o falsa y muestre un mensaje correspondiente.
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un valor booleano");
        boolean valor = lectura.nextBoolean();
        verificar(valor);
    }

    public static void verificar (boolean valor) {
        if (valor) {
            System.out.println("Usted ha introducido el valor 'true'");
        } else {
            System.out.println("Usted ha introducido el valor 'false'");
        }
    }
}

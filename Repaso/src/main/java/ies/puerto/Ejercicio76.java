package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar números positivos utilizando un bucle do-while.
 * El bucle debe continuar hasta que el usuario ingrese un número negativo.
 */
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int respuesta = 0;
        do {
            System.out.println("Introduzca un numero positivo");
            respuesta = lectura.nextInt();
        } while (respuesta>=0);
    }
}

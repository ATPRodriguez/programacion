package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros
 * y muestre su equivalente en dólares solicitando el valor cambio.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca los euros que desea convertir a dolares");
        float cambio = lectura.nextFloat();
        float dolares = cambio * 1.1037f;
        System.out.println(cambio + " euros son: " + dolares + " dolares");
    }
}

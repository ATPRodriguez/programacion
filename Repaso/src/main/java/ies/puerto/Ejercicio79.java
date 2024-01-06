package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero ingresado por el usuario
 * y cuente cuántos dígitos tiene utilizando un bucle for.
 */
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int numero = lectura.nextInt();
        numero = Math.abs(numero);
        int contador = 1;
        for (int i = 0; numero >= 10; i++) {
            numero/=10;
            contador++;
        }
        System.out.println("El numero tiene " + contador + " digitos");
    }
}

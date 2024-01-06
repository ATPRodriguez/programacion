package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que utilice una variable booleana
 * para determinar si un número ingresado por el usuario es par o impar.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = lectura.nextInt();
        boolean par = false;
        if (numero % 2 == 0) {
            par = true;
        }
        if (par) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero introducido es impar");
        }
    }
}

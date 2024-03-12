package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número entero ingresado por el usuario
 * y lo convierta a una cadena, luego muestre la longitud de esa cadena.
 */
public class Ejercicio61 {
    public static void main(String[] args) {
        int numero = pedirNumero();
        String cadena = Integer.toString(numero);
        System.out.println("La longitud de la cadena del numero " + numero + " es: " + cadena.length());
    }

    public static int pedirNumero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        return lectura.nextInt();
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros ingresados por el usuario, realice la suma y muestre el resultado.
 */
public class Ejercicio62 {
    public static void main(String[] args) {
        int numero1 = pedirNumero();
        int numero2 = pedirNumero();
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
    }

    public static int pedirNumero () {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        return lectura.nextInt();
    }
}

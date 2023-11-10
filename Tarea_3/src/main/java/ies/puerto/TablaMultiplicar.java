package ies.puerto;

import java.util.Scanner;

/**
 * @author Alejandro Tomas
 * 9. Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for.
 * Solicita el valor de la tabla por teclado.
 */
public class TablaMultiplicar {
    public static void main(String[] args) {

        int numero = 0;

        Scanner lectura = new Scanner (System.in);

        System.out.println("Introduzca un numero para ver su tabla de multiplicar del 0 al 10");
        numero = lectura.nextInt();

        for (int i = 0; i < 11; ++i) {
            System.out.println(numero+" * "+i+" = "+(numero*i));
            System.out.println();
        }
    }
}
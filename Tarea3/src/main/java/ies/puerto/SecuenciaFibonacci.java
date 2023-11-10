package ies.puerto;

import java.util.Scanner;

/** 5. Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci.
 *  Se debe solicitar el número n por teclado
 */
public class SecuenciaFibonacci {
    public static void main(String[] args) {

        int posicion = 0;
        int solucion = 0;
        int numero1 = 0;
        int numero2 = 1;
        int apoyo = 0;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Quiero ver la secuencia de Fibonacci hasta la posicion:");
        posicion = lectura.nextInt();

        System.out.println("Secuencia de Fibonacci hasta la posicion " + posicion + ":");
        if (posicion >= 1)
            System.out.println(numero1);
        if (posicion >= 2)
            System.out.println(numero2);
        if (posicion >= 3) {
            for (int i = 1; i <= (posicion - 2); i++) {
                solucion = (numero1 + numero2);
                apoyo = numero2;
                numero2 = apoyo + numero1;
                numero1 = apoyo;
                System.out.println(solucion + " ");
            }
        }
    }
}